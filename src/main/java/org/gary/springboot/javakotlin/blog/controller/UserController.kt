package org.gary.springboot.javakotlin.blog.controller;

import lombok.RequiredArgsConstructor;
import org.gary.springboot.javakotlin.blog.entities.User;
import org.gary.springboot.javakotlin.blog.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public Iterable<User> getUsers() {
        return userService.findAll();
    }

    @GetMapping("/{login}")
    public User getUser(String login) {
        return userService.findByLogin(login);
    }
}
