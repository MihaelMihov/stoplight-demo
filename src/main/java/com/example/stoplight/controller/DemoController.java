package com.example.stoplight.controller;

import com.examples.apifirst.api.UserApiDelegate;
import com.examples.apifirst.model.User;
import org.springframework.http.ResponseEntity;

public class DemoController implements UserApiDelegate {
    @Override
    public ResponseEntity<User> postUser(User user) {
        return UserApiDelegate.super.postUser(user);
    }
}
