package com.perpustakaan.perpustakaansalwa.entity.mapping;

import com.perpustakaan.perpustakaansalwa.entity.Buku;
import com.perpustakaan.perpustakaansalwa.entity.dto.BukuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface BukuMapping {
    BukuMapping instance = Mappers.getMapper(BukuMapping.class);

    Buku toEntity(BukuDTO dto);

    BukuDTO toDto(Buku param);

    List<BukuDTO> toListDto   (List<Buku> bukuList);
}

