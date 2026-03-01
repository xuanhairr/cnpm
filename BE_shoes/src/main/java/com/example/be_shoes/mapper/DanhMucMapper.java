package com.example.be_shoes.mapper;

import com.example.be_shoes.dto.Request.DanhMucCreationRequest;
import com.example.be_shoes.dto.Request.DanhMucUpdateRequest;
import com.example.be_shoes.dto.Response.DanhMucResponse;
import com.example.be_shoes.entity.DanhMuc;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DanhMucMapper {
    DanhMuc toDanhMuc(DanhMucCreationRequest request);
    DanhMucResponse toDanhMucResponse(DanhMuc danhMuc);
    void updateDanhMuc(@MappingTarget DanhMuc danhMuc, DanhMucUpdateRequest request);
    List<DanhMucResponse> toListThuongHieuResponse(List<DanhMuc> danhMucs);
}
