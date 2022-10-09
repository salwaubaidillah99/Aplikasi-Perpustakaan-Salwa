package com.perpustakaan.perpustakaansalwa.entity.mapping;

import com.perpustakaan.perpustakaansalwa.entity.PengembalianDetail;
import com.perpustakaan.perpustakaansalwa.entity.dto.PengembalianDetailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface PengembalianDetailMapping {
    PengembalianDetailMapping instance = Mappers.getMapper(PengembalianDetailMapping.class);

    PengembalianDetail toEntity(PengembalianDetailDTO dto);

    PengembalianDetailDTO toDto(PengembalianDetail param);

    List<PengembalianDetailDTO> toListDto   (List<PengembalianDetail> pengembalianDetailList);
}

