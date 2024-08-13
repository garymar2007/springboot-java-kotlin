package org.gary.springboot.javakotlin.blog.controller

import lombok.RequiredArgsConstructor
import org.gary.springboot.javakotlin.blog.entities.Article
import org.gary.springboot.javakotlin.blog.services.ArticleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/articles")
class ArticleController(private val articleService: ArticleService) {

    @GetMapping("/")
    fun findAll(): Iterable<Article> = articleService.findAllByOrderByAddedAtDesc()

    @GetMapping("/{slug}")
    fun findOne(@PathVariable slug: String): Article? = articleService.findBySlug(slug)
}
