package com.perpustakaan.perpustakaansalwa.repository;

import com.perpustakaan.perpustakaansalwa.entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long> {
}
