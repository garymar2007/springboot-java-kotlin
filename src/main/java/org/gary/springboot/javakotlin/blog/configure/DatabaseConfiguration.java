package org.gary.springboot.javakotlin.blog.configure;

import lombok.RequiredArgsConstructor;
import org.gary.springboot.javakotlin.blog.entities.Article;
import org.gary.springboot.javakotlin.blog.entities.User;
import org.gary.springboot.javakotlin.blog.repository.ArticleRepository;
import org.gary.springboot.javakotlin.blog.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DatabaseConfiguration {
    private final UserRepository userRepository;
    private final ArticleRepository articleRepository;

    @Bean
    public ApplicationRunner databaseGetInitialized() {
        // Database initialization
        return args -> {
            final User garyMa = userRepository.save(
                    User.builder()
                            .login("garyma")
                            .firstName("Gary")
                            .lastName("Ma")
                            .description("Chinese Author")
                            .build());
            articleRepository.save(
                    Article.builder()
                            .title("Spring Boot")
                            .headline("Spring Boot is a framework for Java")
                            .content("Spring Boot is a framework for Java")
                            .author(garyMa)
                            .build());
            articleRepository.save(
                    Article.builder()
                            .title("Kotlin")
                            .headline("Kotlin is a programming language")
                            .content("Kotlin is a programming language")
                            .author(garyMa)
                            .build());
        };
    }
}
