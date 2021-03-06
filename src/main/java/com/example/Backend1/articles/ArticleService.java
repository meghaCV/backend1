package com.example.Backend1.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


    @Service
    public class ArticleService {
        @Autowired
        private ArticleRepo repo;

        public List<Article> getAll() {
            return repo.findAll();
        }

        public Optional<Article> getById(Long id) {
            return repo.findById(id);
        }

        public Article create(Article article) {
            return repo.save(article);
        }

        public Article update(Article updatedArticle) {
            return repo.save(updatedArticle);
        }

        public void delete(Long id) {
            repo.deleteById(id);
        }
    }


