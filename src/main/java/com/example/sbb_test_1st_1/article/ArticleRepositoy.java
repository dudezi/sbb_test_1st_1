package com.example.sbb_test_1st_1.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepositoy extends JpaRepository<Article, Integer> {
}
