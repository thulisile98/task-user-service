package com.angel.task.user.service.service;

import com.angel.task.user.service.config.JwtProvider;
import com.angel.task.user.service.model.User;
import com.angel.task.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserProfile(String jwt) {
      String email = JwtProvider.getEmailFromJwtToken(jwt);

      return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
