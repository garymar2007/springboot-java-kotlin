package org.gary.springboot.javakotlin.blog.controller

import org.gary.springboot.javakotlin.blog.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {
    @GetMapping("/")
    fun findAll() = userService.findAll()

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String) = userService.findByLogin(login)
}
