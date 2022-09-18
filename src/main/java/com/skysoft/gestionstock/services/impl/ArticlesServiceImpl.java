package com.skysoft.gestionstock.services.impl;

import com.skysoft.gestionstock.dto.ArticlesDto;
import com.skysoft.gestionstock.exception.EntityNotFoundException;
import com.skysoft.gestionstock.exception.ErrorCodes;
import com.skysoft.gestionstock.exception.InvalidEntityException;
import com.skysoft.gestionstock.model.Articles;
import com.skysoft.gestionstock.repository.ArticlesRepository;
import com.skysoft.gestionstock.services.ArticlesService;
import com.skysoft.gestionstock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ArticlesServiceImpl implements ArticlesService {

    private ArticlesRepository articlesRepository;
    // Constructeur
    @Autowired
    public ArticlesServiceImpl(ArticlesRepository articlesRepository) {

        this.articlesRepository = articlesRepository;
    }




    // Ici on vérifie que l'article est valide avant de l'enregistrer dans la BD
    @Override
    public ArticlesDto save(ArticlesDto dto) {
        List<String> errors = ArticleValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Articles is not valid", dto);
            throw new InvalidEntityException("l'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID, errors);
        }

        Articles savedArticle = articlesRepository.save(ArticlesDto.toEntity(dto));

        return ArticlesDto.fromEntity(savedArticle);
    }





    @Override
    public ArticlesDto findById(Long id) {

        if (id == null) {
            log.error("Article ID is null");
            return null;
        }

        Optional<Articles> articles = articlesRepository.findById(id);

        ArticlesDto dto = ArticlesDto.fromEntity(articles.get());

        return Optional.of(dto).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucun article avec l'ID =" +id+"n'a été trouvé dans la BD",
                        ErrorCodes.ARTICLE_NOT_FOUND));
    }




    @Override
    public ArticlesDto findByNumarticle(String numarticle) {
        if (!StringUtils.hasLength(numarticle)) {
            log.error("Article ID is null");
        }
        Optional<Articles> articles = articlesRepository.findArticlesByNumarticle(numarticle);

        ArticlesDto dto = ArticlesDto.fromEntity(articles.get());

        return Optional.of(dto).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucun article avec le numero =" +numarticle+"n'a été trouvé dans la BD",
                        ErrorCodes.ARTICLE_NOT_FOUND));
    }






    @Override
    public List<ArticlesDto> findAll() {

        return articlesRepository.findAll().stream()
                .map(ArticlesDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        if (id == null) {
            log.error("Article ID is null");
            return;
        }
        articlesRepository.deleteById(id);
    }
}
