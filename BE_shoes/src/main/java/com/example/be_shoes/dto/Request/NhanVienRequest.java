package com.example.be_shoes.dto.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NhanVienRequest {

    @NotNull(message = "TEN_NHAN_VIEN_INVALID")
    @Size(max = 255, message = "TEN_NHAN_VIEN_INVALID")
    private String ten;

    @Email(message = "EMAIL_INVALID")
    @Size(max = 255, message = "EMAIL_INVALID")
    private String email;

    @NotNull(message = "SDT_INVALID")
    @Size(max = 11, message = "SDT_INVALID")
    private String sdt;

    @Size(max = 255, message = "AVATAR_INVALID")
    private String avatar;

    @NotNull(message = "NGAY_SINH_INVALID")
    private LocalDate ngaySinh;

    @NotNull(message = "DIA_CHI_INVALID")
    @Size(max = 255, message = "DIA_CHI_INVALID")
    private String diaChi;

    @NotNull(message = "GIOI_TINH_INVALID")
    private Boolean gioiTinh;

    @Min(value = 0, message = "TRANG_THAI_INVALID")
    @Max(value = 1, message = "TRANG_THAI_INVALID")
    private Integer trangThai;
}
