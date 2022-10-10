package com.perpustakaan.perpustakaansalwa.service;

import com.perpustakaan.perpustakaansalwa.entity.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO findByUsername(String username);

    List<UserDTO> getAllData();
}