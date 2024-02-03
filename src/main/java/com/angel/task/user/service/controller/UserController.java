package com.angel.task.user.service.controller;

import com.angel.task.user.service.model.User;
import com.angel.task.user.service.service.UserService;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<User>getUserProfile(@RequestHeader("Authorization") String jwt){

        User user = userService.getUserProfile(jwt);
        return  new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>>getUsers(@RequestHeader("Authorization") String jwt){

       List<User> users= userService.getAllUsers();
        return  new ResponseEntity<>(users, HttpStatus.OK);
    }


}
