package com.example.be_shoes.dto.Response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ThuongHieuResponse {
    private Long id;
    private String tenThuongHieu;
    private int trangThai;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
