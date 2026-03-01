package com.example.be_shoes.dto.Response;

import com.example.be_shoes.entity.VaiTro;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaiKhoanResponse {
    Long id;
    String tenDangNhap;
    String ma;
    VaiTro vaiTro;
    int trangThai;
}
