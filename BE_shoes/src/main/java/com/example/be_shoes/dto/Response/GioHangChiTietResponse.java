package com.example.be_shoes.dto.Response;

import com.example.be_shoes.entity.GioHang;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class GioHangChiTietResponse {
    private Long id;
    GioHang gioHang;
    SanPhamChiTietResponse sanPhamChiTietResponse;
    int soLuong;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    Double giaTien;
    Integer trangThai;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime thoiGianGiamGia;
}
