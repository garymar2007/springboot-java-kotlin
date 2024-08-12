package org.gary.springboot.javakotlin.blog.services;

import lombok.RequiredArgsConstructor;
import org.gary.springboot.javakotlin.blog.repository.ArticleRepository;
import org.springframework.stereotype.Service;
import org.gary.springboot.javakotlin.blog.entities.Article;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public Iterable<Article> getArticles() {
        return articleRepository.findAllByOrderByAddedAtDesc();
    }

    public Article getArticle(String slug) {
        return articleRepository.findBySlug(slug);
    }
}
