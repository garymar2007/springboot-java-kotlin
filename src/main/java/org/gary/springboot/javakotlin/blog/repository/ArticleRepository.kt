package org.gary.springboot.javakotlin.blog.repository

import org.gary.springboot.javakotlin.blog.entities.Article
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}
