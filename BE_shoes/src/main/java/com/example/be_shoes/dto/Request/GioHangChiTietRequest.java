package com.example.be_shoes.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GioHangChiTietRequest {
    Long idGioHang;
    Long idSanPhamChiTiet;
    int soLuong;
    Double giaTien;
    int id_khachHang;
    LocalDateTime thoiGianGiamGia;
}
