package org.gary.springboot.javakotlin.blog.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import lombok.NoArgsConstructor

@Entity
@NoArgsConstructor
data class User (
    var login: String,
    var firstName: String,
    var lastName: String,
    var description: String,
    @Id  @GeneratedValue var id: Long
) {
    override fun hashCode(): Int = this.id.hashCode()

    override fun equals(other: Any?): Boolean  = when(other) {
        null -> false
        is User -> this.id == other.id
        else -> false
    }
}
