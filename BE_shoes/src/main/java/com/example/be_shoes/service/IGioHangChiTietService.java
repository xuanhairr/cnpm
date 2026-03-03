package com.example.be_shoes.service;

import com.example.be_shoes.dto.Request.GioHangChiTietRequest;
import com.example.be_shoes.dto.Response.GioHangChiTietResponse;

import java.util.List;

public interface IGioHangChiTietService {
    List<GioHangChiTietResponse> findByIdGioHang(Long idGioHang);

    GioHangChiTietResponse themGioHangChiTiet(GioHangChiTietRequest gioHangChiTietRequest);


    int xoaKhoiGioHang(Long idGioHangChiTiet);
    int xoaKhoiGioHangBySanPhamChiTiet(Long idSanPhamChiTiet, Long idGioHang);

    void updateGioHangChiTiet(Long idSanPhamChiTiet, Long idGioHang, int soLuong);
    void xoaHetGioHang(Long idGioHang);

}
