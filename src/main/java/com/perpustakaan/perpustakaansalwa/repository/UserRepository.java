package com.perpustakaan.perpustakaansalwa.repository;

import com.perpustakaan.perpustakaansalwa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
