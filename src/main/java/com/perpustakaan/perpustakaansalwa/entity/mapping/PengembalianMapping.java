package com.perpustakaan.perpustakaansalwa.entity.mapping;

import com.perpustakaan.perpustakaansalwa.entity.Pengembalian;
import com.perpustakaan.perpustakaansalwa.entity.dto.PengembalianDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface PengembalianMapping {
    PengembalianMapping instance = Mappers.getMapper(PengembalianMapping.class);

    Pengembalian toEntity(PengembalianDTO dto);

    PengembalianDTO toDto(Pengembalian param);

    List<PengembalianDTO> toListDto   (List<Pengembalian> pengembalianList);
}

