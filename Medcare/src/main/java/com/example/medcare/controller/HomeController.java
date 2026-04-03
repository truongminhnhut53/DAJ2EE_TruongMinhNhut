package com.example.medcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    // --- IN-MEMORY ARTICLE DATABASE ---
    private static final List<Map<String, Object>> ARTICLES = ArticleMockData.getArticles();

    @GetMapping("/articles")
    public String articles(org.springframework.ui.Model model) {
        model.addAttribute("articles", ARTICLES);
        return "articles";
    }

    @GetMapping("/article/{id}")
    public String articleDetail(@org.springframework.web.bind.annotation.PathVariable int id, org.springframework.ui.Model model) {
        Map<String, Object> found = ARTICLES.stream().filter(a -> (int) a.get("id") == id).findFirst().orElse(null);
        if(found == null) return "redirect:/articles";
        model.addAttribute("article", found);
        return "article-detail";
    }


}