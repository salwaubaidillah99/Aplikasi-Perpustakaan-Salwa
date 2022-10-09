package com.perpustakaan.perpustakaansalwa.service;

import com.perpustakaan.perpustakaansalwa.entity.dto.PeminjamanDTO;

import java.util.List;

public interface PeminjamanService {
    PeminjamanDTO save(PeminjamanDTO param);

    List<PeminjamanDTO> findAllData();

    PeminjamanDTO update(PeminjamanDTO param, Long id);

    Boolean delete(Long id);

    PeminjamanDTO findById(Long id);
}
