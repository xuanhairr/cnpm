package com.example.be_shoes.dto.Request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KichThuocRequest {

    @NotNull(message = "TEN_KICHTHUOC_INVALID")
    @Size(min = 2, message = "TEN_KICHTHUOC_INVALID")
    private String tenKichThuoc;

    @Min(value = 0, message = "TRANGTHAI_KICHTHUOC_INVALID")
    @Max(value = 1, message = "TRANGTHAI_KICHTHUOC_INVALID")
    int trangThai;
}
