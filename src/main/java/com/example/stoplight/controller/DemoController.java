package com.example.stoplight.controller;

import com.example.stoplight.service.UserService;
import com.examples.apifirst.api.UserApi;
import com.examples.apifirst.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<User> postUser(User user) {
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }

}
