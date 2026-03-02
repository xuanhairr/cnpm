package com.example.be_shoes.service;

import com.example.be_shoes.dto.Request.KichThuocRequest;
import com.example.be_shoes.dto.Response.KichThuocResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IKichThuocService {

    Page<KichThuocResponse> getAllKichThuocPageable(String tenKichThuoc, Pageable pageable);

    KichThuocResponse createKichThuoc(KichThuocRequest kichThuocRequest);

    KichThuocResponse getKichThuocById(Long id);

    KichThuocResponse updateKichThuoc(Long idKichThuoc, KichThuocRequest kichThuocRequest);

    String deleteKichThuoc(Long id);
}
