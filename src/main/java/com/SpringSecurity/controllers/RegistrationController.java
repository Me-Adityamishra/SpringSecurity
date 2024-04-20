package com.SpringSecurity.controllers;

import com.SpringSecurity.entities.MyUser;
import com.SpringSecurity.repositories.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private MyRepository myRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/register/user")
    public MyUser createUser(@RequestBody MyUser user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return myRepository.save(user);
    }

}
