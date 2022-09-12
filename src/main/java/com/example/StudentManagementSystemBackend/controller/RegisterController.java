package com.example.StudentManagementSystemBackend.controller;
import com.example.StudentManagementSystemBackend.model.Register;
import com.example.StudentManagementSystemBackend.model.Student;
import com.example.StudentManagementSystemBackend.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class RegisterController {

    @Autowired
    RegisterRepository registerRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/register") // insert into student values(?, ?, ?)
    public List<Register> addUser(@RequestBody Register register) {
        registerRepository.save(register);
        return registerRepository.findAll();
    }
}
