package org.gary.springboot.javakotlin.blog.configure

import org.gary.springboot.javakotlin.blog.entities.Article
import org.gary.springboot.javakotlin.blog.entities.User
import org.gary.springboot.javakotlin.blog.repository.ArticleRepository
import org.gary.springboot.javakotlin.blog.repository.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class DatabaseConfiguration {

    @Bean
    open fun databaseGetInitialized(
        userRepository: UserRepository,
        articleRepository: ArticleRepository) = ApplicationRunner {
        // Database initialization
        val garyMa: User = userRepository.save(
            User("garyma", "Gary", "Ma", "Chinese", 1L)
        )
        articleRepository.save(
            Article(
                id = 1L,
                title = "Spring Boot",
                headline = "Spring Boot is a framework for Java",
                content = "Spring Boot is a framework for Java",
                author = garyMa,
                slug = "spring-boot",
                addedAt = java.time.LocalDateTime.now()
            )
        )
        articleRepository.save(
            Article(
                id = 2L,
                title = "Kotlin",
                headline = "Kotlin is a programming language",
                content = "Kotlin is a programming language",
                author = garyMa,
                slug = "kotlin",
                addedAt = java.time.LocalDateTime.now()
            )
        )
    }
}
