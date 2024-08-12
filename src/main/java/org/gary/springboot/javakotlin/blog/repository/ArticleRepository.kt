package org.gary.springboot.javakotlin.blog.repository;

import org.gary.springboot.javakotlin.blog.entities.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article findBySlug(String slug);
    Iterable<Article> findAllByOrderByAddedAtDesc();
}
