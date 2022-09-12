package com.skysoft.gestionstock.services;

import com.skysoft.gestionstock.dto.ArticlesDto;

import java.util.List;

public interface ArticlesService {

    ArticlesDto save(ArticlesDto dto);
    ArticlesDto findById(Integer id);
    ArticlesDto findByNumarticle(String numarticle);
    List<ArticlesDto> findAll();

    void delete(Integer id);
}
