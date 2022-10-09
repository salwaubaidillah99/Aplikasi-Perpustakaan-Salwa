package com.perpustakaan.perpustakaansalwa.entity.mapping;

import com.perpustakaan.perpustakaansalwa.entity.Petugas;
import com.perpustakaan.perpustakaansalwa.entity.dto.PetugasDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PetugasMapping {
    PetugasMapping instance = Mappers.getMapper(PetugasMapping.class);

    Petugas toEntity(PetugasDTO dto);

    PetugasDTO toDto(Petugas param);

    List<PetugasDTO> toListDto   (List<Petugas> petugasList);
}

