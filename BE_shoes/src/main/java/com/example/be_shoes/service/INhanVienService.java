package com.example.be_shoes.service;

import com.example.be_shoes.dto.Request.NhanVienRequest;
import com.example.be_shoes.dto.Response.NhanVienResponse;
import jakarta.mail.MessagingException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface INhanVienService {

    Page<NhanVienResponse> getAllNhanVienPageable(String ten, Pageable pageable);

    NhanVienResponse createNhanVien(NhanVienRequest nhanVienRequest) throws MessagingException;

    NhanVienResponse getNhanVienById(Long id);

    NhanVienResponse updateNhanVien(Long id, NhanVienRequest nhanVienRequest);

    String deleteNhanVien(Long id);

}
