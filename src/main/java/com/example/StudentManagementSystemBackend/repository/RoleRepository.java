package com.example.StudentManagementSystemBackend.repository;

import com.example.StudentManagementSystemBackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(Role roleName);
}
