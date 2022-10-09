package com.perpustakaan.perpustakaansalwa.service;

import com.perpustakaan.perpustakaansalwa.entity.dto.PengembalianDetailDTO;

import java.util.List;

public interface PengembalianDetailService {
    PengembalianDetailDTO save(PengembalianDetailDTO param);

    List<PengembalianDetailDTO> findAllData();

    PengembalianDetailDTO update(PengembalianDetailDTO param, Long id);

    Boolean delete(Long id);

    PengembalianDetailDTO findById(Long id);
}