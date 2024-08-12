package org.gary.springboot.javakotlin.blog.repository

import org.gary.springboot.javakotlin.blog.entities.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String?): User?
}
