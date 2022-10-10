package com.perpustakaan.perpustakaansalwa.service;

import com.perpustakaan.perpustakaansalwa.entity.dto.PenerbitDTO;
import java.util.List;

public interface PenerbitService {
    PenerbitDTO save(PenerbitDTO param);

    List<PenerbitDTO> findAllData();

    PenerbitDTO update(PenerbitDTO param, Long id);

    Boolean delete(Long id);

    PenerbitDTO findById(Long id);
}

