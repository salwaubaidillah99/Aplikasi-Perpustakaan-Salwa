package com.perpustakaan.perpustakaansalwa.service.Impl;

import com.perpustakaan.perpustakaansalwa.entity.dto.UserDTO;
import com.perpustakaan.perpustakaansalwa.entity.mapping.UserMapping;
import com.perpustakaan.perpustakaansalwa.repository.UserRepository;
import com.perpustakaan.perpustakaansalwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO findByUsername(String username) {
        return UserMapping.instance.toDto(repository.findByUsername(username));
    }

    @Override
    public List<UserDTO> getAllData() {
        return UserMapping.instance.toListDto(repository.findAll());
    }
}
