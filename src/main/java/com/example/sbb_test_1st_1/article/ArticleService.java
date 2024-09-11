package com.example.sbb_test_1st_1.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepositoy articleRepositoy;

    public List<Article> getList() {
        return this.articleRepositoy.findAll();
    }
}
