package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.ArticlesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticlesDto dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le numero de l'article");
            errors.add("Veuillez renseigner le nom de l'article");
            errors.add("Veuillez renseigner la description de l'article");
            errors.add("Veuillez renseigner le prix unitaire HT de l'article");
            errors.add("Veuillez renseigner le taux TVA de l'article");
            errors.add("Veuillez renseigner le prix TTC de l'article");
            errors.add("Veuillez selectionner une famille");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNumarticle())) {
            errors.add("Veuillez renseigner le numero de l'article");
        }
        if (!StringUtils.hasLength(dto.getNomarticle())) {
            errors.add("Veuillez renseigner le nom de l'article");
        }
        if (!StringUtils.hasLength(dto.getDescription())) {
            errors.add("Veuillez renseigner la description de l'article");
        }
        if (dto.getPrixunitaireht() == null) {
            errors.add("Veuillez renseigner le prix unitaire HT de l'article");
        }
        if (dto.getTauxtva() == null) {
            errors.add("Veuillez renseigner le taux TVA de l'article");
        }
        if (dto.getPrixunitairettc() == null) {
            errors.add("Veuillez renseigner le prix TTC de l'article");
        }
        if (dto.getFamillearticles() == null) {
            errors.add("Veuillez selectionner une categorie");
        }
        return errors;
    }
}
