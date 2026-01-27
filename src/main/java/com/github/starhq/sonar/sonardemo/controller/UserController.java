package com.github.starhq.sonar.sonardemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.starhq.sonar.sonardemo.pojo.User;

@RestController
class UserController {

    @GetMapping
    User get() {
        User user = new User();
        user.setId(1L);
        user.setName("starhq");
        return user;
    }
}