package org.gary.springboot.javakotlin.blog.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
data class Article (
    @Id
    @GeneratedValue
    val id: Long,
    val title: String,
    val headline: String,
    val content: String,
    @ManyToOne
    val author: User,
    val slug: String,
    val addedAt: LocalDateTime
) {
    override fun hashCode(): Int = this.id.hashCode()

    override fun equals(other: Any?): Boolean = when (other) {
        null -> false
        is Article -> this.id == other.id
        else -> false
    }
}
