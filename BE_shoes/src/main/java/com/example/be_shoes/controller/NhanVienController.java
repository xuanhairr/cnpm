package com.example.be_shoes.controller;

import com.example.be_shoes.dto.Request.NhanVienRequest;
import com.example.be_shoes.dto.Response.ApiResponse;
import com.example.be_shoes.dto.Response.NhanVienResponse;
import com.example.be_shoes.service.INhanVienService;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/nhanviens")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class NhanVienController {

    INhanVienService nhanVienService;

    @GetMapping("")
    ApiResponse<Page<NhanVienResponse>> getAllNhanViens(
            @RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber,
            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(name = "ten", defaultValue = "") String ten) {
        Pageable pageable = PageRequest.of(Math.max(0, pageNumber), Math.max(1, pageSize));
        ApiResponse<Page<NhanVienResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setData(nhanVienService.getAllNhanVienPageable(ten, pageable));
        return apiResponse;
    }

    @PostMapping("")
    ApiResponse<NhanVienResponse> createNhanVien(@RequestBody @Valid NhanVienRequest nhanVienRequest) throws MessagingException {
        ApiResponse<NhanVienResponse> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Thêm mới thành công nhân viên " + nhanVienRequest.getTen());
        apiResponse.setData(nhanVienService.createNhanVien(nhanVienRequest));
        return apiResponse;
    }

    @GetMapping("/{id}")
    ApiResponse<NhanVienResponse> getNhanVienById(@PathVariable Long id) {
        ApiResponse<NhanVienResponse> apiResponse = new ApiResponse<>();
        apiResponse.setData(nhanVienService.getNhanVienById(id));
        return apiResponse;
    }

    @DeleteMapping("/{id}")
    ApiResponse<String> deleteNhanVienById(@PathVariable Long id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        apiResponse.setMessage(nhanVienService.deleteNhanVien(id));
        return apiResponse;
    }
    
    @PutMapping("/{id}")
    ApiResponse<NhanVienResponse> updateNhanVien(@PathVariable Long id, @RequestBody @Valid NhanVienRequest nhanVienRequest) {
        ApiResponse<NhanVienResponse> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Cập nhật thành công nhân viên");
        apiResponse.setData(nhanVienService.updateNhanVien(id, nhanVienRequest));
        return apiResponse;
    }
}
