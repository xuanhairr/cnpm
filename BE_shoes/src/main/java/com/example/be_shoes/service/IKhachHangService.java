package com.example.be_shoes.service;

import com.example.be_shoes.dto.Request.KhachHangRequest1;
import com.example.be_shoes.dto.Response.KhachHangResponse1;
import jakarta.mail.MessagingException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IKhachHangService {

    Page<KhachHangResponse1> getAllKhachHangPageable(String ten, Pageable pageable);

    KhachHangResponse1 createKhachHang(KhachHangRequest1 khachHangRequest) throws MessagingException;

    KhachHangResponse1 getKhachHangById(Long id);

    KhachHangResponse1 updateKhachHang(Long id, KhachHangRequest1 khachHangRequest);

    String deleteKhachHang(Long id);

}
