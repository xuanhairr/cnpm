package com.example.be_shoes.dto.Response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SanPhamCustumerResponse {
    private Long id;
    private String tenSanPham;
    private Double giaBanThapNhat; // Giá bán thấp nhất
    private Double giaBanCaoNhat; // Giá bán cao nhất
    private String giaHienThi; // Giá hiển thị (dạng chuỗi)
    private String hinhAnh;
    private String phanTramGiamGia;
    private Long soLuongBan;
    private Integer soLuongSanPhamChiTiet;


}
