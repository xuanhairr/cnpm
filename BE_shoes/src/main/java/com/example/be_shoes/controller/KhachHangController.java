package com.example.be_shoes.controller;


import com.example.be_shoes.dto.Response.ApiResponse;
import com.example.be_shoes.mapper.KhachHangMapper;
import com.example.be_shoes.repository.KhachHangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/khachHang")
public class KhachHangController {

    private final KhachHangMapper khachHangMapper;
    private final KhachHangRepository khachHangRepository;
    @GetMapping
    public ResponseEntity<ApiResponse> getAllKhachHang() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Lấy danh sách khách hàng thành công !");
        apiResponse.setData(khachHangMapper.toListKhachHangResponse(khachHangRepository.findAll()));
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
