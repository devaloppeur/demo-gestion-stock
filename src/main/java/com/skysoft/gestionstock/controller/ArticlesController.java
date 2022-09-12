package com.skysoft.gestionstock.controller;

import com.skysoft.gestionstock.services.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;
}
