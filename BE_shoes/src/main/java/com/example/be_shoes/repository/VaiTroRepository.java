package com.example.be_shoes.repository;

import com.example.be_shoes.entity.VaiTro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {
    VaiTro findByTenVaiTro(String tenVaiTro);
}
