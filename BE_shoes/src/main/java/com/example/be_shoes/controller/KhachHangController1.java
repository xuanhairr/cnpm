package com.example.be_shoes.controller;

import com.example.be_shoes.dto.Request.KhachHangRequest1;
import com.example.be_shoes.dto.Response.ApiResponse;
import com.example.be_shoes.dto.Response.KhachHangResponse1;
import com.example.be_shoes.service.IKhachHangService;
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
@RequestMapping("/api/v1/khachhangs")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class KhachHangController1 {

    IKhachHangService khachHangService;

    @GetMapping("")
    ApiResponse<Page<KhachHangResponse1>> getAllKhachHangs(@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber,
                                                           @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
                                                           @RequestParam(name = "ten", defaultValue = "") String ten) {
        Pageable pageable = PageRequest.of(Math.max(0, pageNumber), Math.max(1, pageSize));
        ApiResponse<Page<KhachHangResponse1>> apiResponse = new ApiResponse<>();
        apiResponse.setData(khachHangService.getAllKhachHangPageable(ten, pageable));
        return apiResponse;
    }

    // Tạo mới khách hàng
    @PostMapping("")
    ApiResponse<KhachHangResponse1> createKhachHang(@RequestBody @Valid KhachHangRequest1 khachHangRequest) throws MessagingException {
        ApiResponse<KhachHangResponse1> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Thêm mới thành công khách hàng " + khachHangRequest.getTen());
        apiResponse.setData(khachHangService.createKhachHang(khachHangRequest));
        return apiResponse;
    }

    // Lấy thông tin chi tiết khách hàng theo ID
    @GetMapping("/{id}")
    ApiResponse<KhachHangResponse1> getKhachHangById(@PathVariable Long id) {
        ApiResponse<KhachHangResponse1> apiResponse = new ApiResponse<>();
        apiResponse.setData(khachHangService.getKhachHangById(id));
        return apiResponse;
    }

    // Xóa khách hàng theo ID
    @DeleteMapping("/{id}")
    ApiResponse<String> deleteKhachHangById(@PathVariable Long id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        apiResponse.setMessage(khachHangService.deleteKhachHang(id));
        return apiResponse;
    }

    // Cập nhật thông tin khách hàng theo ID
    @PutMapping("/{id}")
    ApiResponse<KhachHangResponse1> updateKhachHang(@PathVariable Long id, @RequestBody @Valid KhachHangRequest1 khachHangRequest) {
        ApiResponse<KhachHangResponse1> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Cập nhật thành công khách hàng");
        apiResponse.setData(khachHangService.updateKhachHang(id, khachHangRequest));
        return apiResponse;
    }

}
