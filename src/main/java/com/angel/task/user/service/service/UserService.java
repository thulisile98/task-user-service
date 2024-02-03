package com.angel.task.user.service.service;

import com.angel.task.user.service.model.User;

import java.util.List;

public interface UserService {
    public User getUserProfile(String jwt);
    public List<User> getAllUsers();
}
