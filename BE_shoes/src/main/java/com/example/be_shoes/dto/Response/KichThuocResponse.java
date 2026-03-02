package com.example.be_shoes.dto.Response;

import com.example.be_shoes.entity.KichThuoc;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KichThuocResponse {

    Long id;
    String tenKichThuoc;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDateTime createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDateTime updatedAt;

    int trangThai;

    public static KichThuocResponse fromKichThuoc(KichThuoc kichThuoc) {
        return KichThuocResponse.builder()
                .id(kichThuoc.getId())
                .tenKichThuoc(kichThuoc.getTenKichThuoc())
                .createdAt(kichThuoc.getCreated_at())
                .updatedAt(kichThuoc.getUpdated_at())
                .trangThai(kichThuoc.getTrangThai())
                .build();
    }
}
