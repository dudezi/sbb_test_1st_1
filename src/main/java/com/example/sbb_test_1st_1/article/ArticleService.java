package com.example.sbb_test_1st_1.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepositoy articleRepositoy;

    public List<Article> getList() {
        return this.articleRepositoy.findAll();
    }

    public void create(String title, String content) {
        Article a = new Article();
        a.setTitle(title);
        a.setContent(content);
        a.setCreatedDate(LocalDateTime.now());
        this.articleRepositoy.save(a);
    }
}
