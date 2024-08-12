package org.gary.springboot.javakotlin.blog.services

import lombok.RequiredArgsConstructor
import org.gary.springboot.javakotlin.blog.entities.Article
import org.gary.springboot.javakotlin.blog.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(private val articleRepository: ArticleRepository) {
    fun findAllByOrderByAddedAtDesc() =
        articleRepository.findAllByOrderByAddedAtDesc()
    fun findBySlug(slug: String) = articleRepository.findBySlug(slug)
}
