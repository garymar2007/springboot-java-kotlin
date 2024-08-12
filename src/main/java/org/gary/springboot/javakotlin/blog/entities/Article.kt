package org.gary.springboot.javakotlin.blog.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class Article (
    @Id
    @GeneratedValue
    val id: Long? = null,
    val title: String? = null,
    val headline: String? = null,
    val content: String? = null,
    @ManyToOne
    val author: User,
    val slug: String? = null,
    val addedAt: LocalDateTime? = null
)
