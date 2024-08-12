package org.gary.springboot.javakotlin.blog.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.gary.springboot.javakotlin.blog.repository.UserRepository;
import org.gary.springboot.javakotlin.blog.entities.User;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
