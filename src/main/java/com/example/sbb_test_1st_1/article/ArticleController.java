package com.example.sbb_test_1st_1.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ArticleController {
    private final ArticleRepositoy articleRepositoy;

    @GetMapping("/article/list")
    public String list(Model model) {
        List<Article> articleList = this.articleRepositoy.findAll();
        model.addAttribute("articleList", articleList);
        return "article_list";
    }
}
