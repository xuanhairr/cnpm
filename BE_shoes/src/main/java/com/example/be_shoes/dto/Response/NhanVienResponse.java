package com.example.be_shoes.dto.Response;

import com.example.be_shoes.entity.NhanVien;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class NhanVienResponse {
    private Long id;
    private String ten;
    private String email;
    private String sdt;
    private String avatar;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate ngaySinh;
    private String diaChi;
    private Boolean gioiTinh;
    private Integer trangThai;

    public static NhanVienResponse fromNhanVien(NhanVien nhanVien) {
        return NhanVienResponse.builder()
                .id(nhanVien.getId())
                .ten(nhanVien.getTen())
                .email(nhanVien.getEmail())
                .sdt(nhanVien.getSdt())
                .avatar(nhanVien.getAvatar())
                .ngaySinh(nhanVien.getNgaySinh())
                .diaChi(nhanVien.getDiaChi())
                .gioiTinh(nhanVien.getGioiTinh())
                .trangThai(nhanVien.getTrangThai())

                .build();
    }
}
