package org.gary.springboot.javakotlin.blog.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import lombok.NoArgsConstructor

@Entity
@NoArgsConstructor
class User (
    var login: String,
    var firstName: String,
    var lastName: String,
    var description: String? = null,
    @Id  @GeneratedValue var id: Long? = null
)
