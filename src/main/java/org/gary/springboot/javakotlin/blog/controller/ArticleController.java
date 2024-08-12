package org.gary.springboot.javakotlin.blog.controller;

import lombok.RequiredArgsConstructor;
import org.gary.springboot.javakotlin.blog.entities.Article;
import org.gary.springboot.javakotlin.blog.services.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/articles")
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/")
    public Iterable<Article> getArticles() {
        return articleService.getArticles();
    }

    @GetMapping("/{slug}")
    public Article getArticle(String slug) {
        return articleService.getArticle(slug);
    }
}
