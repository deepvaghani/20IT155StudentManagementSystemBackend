package com.example.StudentManagementSystemBackend.repository;

import com.example.StudentManagementSystemBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
