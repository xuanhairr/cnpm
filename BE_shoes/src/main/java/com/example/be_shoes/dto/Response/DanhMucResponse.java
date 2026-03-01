package com.example.be_shoes.dto.Response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DanhMucResponse {
    private Long id;
    private String tenDanhMuc;
    private int trangThai;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
