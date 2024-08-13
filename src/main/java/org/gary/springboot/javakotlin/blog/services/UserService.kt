package org.gary.springboot.javakotlin.blog.services

import lombok.RequiredArgsConstructor
import org.gary.springboot.javakotlin.blog.entities.User
import org.gary.springboot.javakotlin.blog.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findByLogin(login: String): User? = userRepository.findByLogin(login)
    fun findAll(): Iterable<User>? = userRepository.findAll()
}
