package com.perpustakaan.perpustakaansalwa.entity.mapping;

import com.perpustakaan.perpustakaansalwa.entity.User;
import com.perpustakaan.perpustakaansalwa.entity.dto.ResponseAuthDTO;
import com.perpustakaan.perpustakaansalwa.entity.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface UserMapping {
    UserMapping instance = Mappers.getMapper(UserMapping.class);

    User toEntity(UserDTO dto);

    UserDTO toDto(User param);

    List<UserDTO> toListDto(List<User> data);

    ResponseAuthDTO fromEntityToResponseDto(User data);

    ResponseAuthDTO fromDtoToResponseDto(UserDTO data);

}
