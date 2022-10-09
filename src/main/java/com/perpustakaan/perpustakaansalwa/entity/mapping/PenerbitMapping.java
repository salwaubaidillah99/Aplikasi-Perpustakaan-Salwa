package com.perpustakaan.perpustakaansalwa.entity.mapping;

import com.perpustakaan.perpustakaansalwa.entity.Penerbit;
import com.perpustakaan.perpustakaansalwa.entity.dto.PenerbitDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PenerbitMapping {
    PenerbitMapping instance = Mappers.getMapper(PenerbitMapping.class);

    Penerbit toEntity(PenerbitDTO dto);

    PenerbitDTO toDto(Penerbit param);

    List<PenerbitDTO> toListDto   (List<Penerbit> penerbitList);
}



