package com.example.be_shoes.mapper;

import com.example.be_shoes.dto.Request.TaiKhoanRequest;
import com.example.be_shoes.dto.Response.TaiKhoanResponse;
import com.example.be_shoes.entity.TaiKhoan;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaiKhoanMapper {
    TaiKhoan toTaiKhoan(TaiKhoanRequest taiKhoanRequest);

    void updateTaiKhoan(@MappingTarget TaiKhoan taiKhoan, TaiKhoanRequest taiKhoanRequest);

    TaiKhoanResponse toTaiKhoanResponse(TaiKhoan taiKhoan);

    List<TaiKhoanResponse> toListTaiKhoanResponse(List<TaiKhoan> taiKhoanList);

}
