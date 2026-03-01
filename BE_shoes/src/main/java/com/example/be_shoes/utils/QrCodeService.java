package com.example.be_shoes.utils;

import com.example.be_shoes.dto.Response.SanPhamChiTietResponse;

import java.io.IOException;

public interface QrCodeService {
    String generateQrCode(SanPhamChiTietResponse response) throws IOException;
    SanPhamChiTietResponse decodeQrCodeToSanPhamChiTiet(String qrCodeBase64) throws IOException;
}

