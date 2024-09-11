package com.example.sbb_test_1st_1.article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("/article/list")
    public String list() {
        return "article_list";
    }
}
