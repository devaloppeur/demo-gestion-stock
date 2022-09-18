package com.skysoft.gestionstock.controller;

import com.skysoft.gestionstock.controller.api.ArticlesApi;
import com.skysoft.gestionstock.dto.ArticlesDto;
import com.skysoft.gestionstock.services.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticlesController implements ArticlesApi {

    ArticlesService articlesService;

    @Autowired
    public ArticlesController(ArticlesService articlesService) {

        this.articlesService = articlesService;
    }

    @Override
    public ArticlesDto save(ArticlesDto dto) {
        return articlesService.save(dto);
    }

    @Override
    public ArticlesDto findById(Integer id) {
        return articlesService.findById(id);
    }

    @Override
    public ArticlesDto findByNumarticle(String numarticle) {
        return articlesService.findByNumarticle(numarticle);
    }

    @Override
    public List<ArticlesDto> findAll() {
        return articlesService.findAll();
    }

    @Override
    public void delete(Integer id) {
        articlesService.delete(id);
    }
}
