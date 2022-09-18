package com.skysoft.gestionstock.controller.api;

import com.skysoft.gestionstock.dto.ArticlesDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.skysoft.gestionstock.utils.Constants.APP_ROOT;

import java.util.List;

public interface ArticlesApi {

    @PostMapping(value = APP_ROOT + "/articles/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ArticlesDto save(@RequestBody ArticlesDto dto);

    @GetMapping(value = APP_ROOT + "/articles/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticlesDto findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROOT + "/articles/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticlesDto findByNumarticle(@PathVariable("codeArticle") String numarticle);

    @GetMapping(value = APP_ROOT + "/articles/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticlesDto> findAll();

    @DeleteMapping(value = APP_ROOT + "/articles/delete/{id Article}")
    void delete(@PathVariable("idArticle") Integer id);
}
