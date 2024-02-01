package com.angel.task.user.service.controller;

import com.angel.task.user.service.repository.UserRepository;
import com.angel.task.user.service.service.CustomerUserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;

public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder
      @Autowired
    private CustomerUserServiceImplementation customerDetails;



}
