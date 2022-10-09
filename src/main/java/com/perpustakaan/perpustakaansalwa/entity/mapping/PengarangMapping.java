package com.perpustakaan.perpustakaansalwa.entity.mapping;

import com.perpustakaan.perpustakaansalwa.entity.Pengarang;
import com.perpustakaan.perpustakaansalwa.entity.dto.PengarangDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PengarangMapping {
    PengarangMapping instance = Mappers.getMapper(PengarangMapping.class);

    Pengarang toEntity(PengarangDTO dto);

    PengarangDTO toDto(Pengarang param);

    List<PengarangDTO> toListDto   (List<Pengarang> pengarangList);
}
