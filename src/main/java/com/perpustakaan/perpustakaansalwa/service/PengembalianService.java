package com.perpustakaan.perpustakaansalwa.service;

import com.perpustakaan.perpustakaansalwa.entity.dto.PengembalianDTO;

import java.util.List;

public interface PengembalianService {
    PengembalianDTO save(PengembalianDTO param);

    List<PengembalianDTO> findAllData();

    PengembalianDTO update(PengembalianDTO param, Long id);

    Boolean delete(Long id);

    PengembalianDTO findById(Long id);
}