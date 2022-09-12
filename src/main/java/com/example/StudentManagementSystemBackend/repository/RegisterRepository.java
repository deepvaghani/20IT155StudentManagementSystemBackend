package com.example.StudentManagementSystemBackend.repository;

import com.example.StudentManagementSystemBackend.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, String> {
}
