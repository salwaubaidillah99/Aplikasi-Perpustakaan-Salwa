package com.perpustakaan.perpustakaansalwa.service;

import com.perpustakaan.perpustakaansalwa.entity.dto.AuthenticationDTO;
import com.perpustakaan.perpustakaansalwa.entity.dto.ResponseAuthDTO;
import com.perpustakaan.perpustakaansalwa.entity.dto.UserDTO;

public interface AuthService {
    ResponseAuthDTO register(UserDTO data);

    ResponseAuthDTO login(AuthenticationDTO data);

}