package com.example.be_shoes.dto.Request;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DanhMucUpdateRequest {
    @NotBlank(message = "Tên danh mục không được để trống !")
    String tenDanhMuc;
    int trangThai;
}
