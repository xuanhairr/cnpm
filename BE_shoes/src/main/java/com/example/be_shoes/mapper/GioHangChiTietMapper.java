package com.example.be_shoes.mapper;

import com.example.be_shoes.dto.Response.GioHangChiTietResponse;
import com.example.be_shoes.dto.Response.SanPhamChiTietResponse;
import com.example.be_shoes.entity.GioHangChiTiet;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class GioHangChiTietMapper {

    public GioHangChiTietResponse toGioHangChiTietResponse(GioHangChiTiet gioHangChiTiet) {
        return GioHangChiTietResponse.builder()
                .id(gioHangChiTiet.getId())
                .gioHang(gioHangChiTiet.getGioHang())
                .sanPhamChiTietResponse(SanPhamChiTietResponse.fromSanPhamChiTiet(gioHangChiTiet.getSanPhamChiTiet()))
                .soLuong(gioHangChiTiet.getSoLuong())
                .trangThai(gioHangChiTiet.getTrangThai())
                .updatedAt(gioHangChiTiet.getUpdated_at())
                .createdAt(gioHangChiTiet.getCreated_at())
                .giaTien(gioHangChiTiet.getSanPhamChiTiet().getGiaBanSauKhiGiam())
                .thoiGianGiamGia(gioHangChiTiet.getThoiGianGiamGia())
                .build();
    }

    public List<GioHangChiTietResponse> toListGioHangCtResponse(List<GioHangChiTiet> gioHangCtList) {
        if (gioHangCtList.isEmpty()) {
            return Collections.emptyList();
        }
        return gioHangCtList.stream().map(this::toGioHangChiTietResponse).toList();
    }


}
