package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.FamillearticlesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FamillearticlesValidator {

    public static List<String> validate(FamillearticlesDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {

            errors.add("Veuillez renseigner le numero de la famille de l'article");
            errors.add("Veuillez renseigner le libelle de la famille de l'article");
            errors.add("Veuillez renseigner la description de la famille de l'article");
            errors.add("Veuillez renseigner le code abrege de la famille de l'article");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNumfamille())) {
            errors.add("Veuillez renseigner le numero de la famille de l'article");
        }
        if (!StringUtils.hasLength(dto.getLibelle())) {
            errors.add("Veuillez renseigner le libelle de la famille de l'article");
        }
        if (!StringUtils.hasLength(dto.getDescription())) {
            errors.add("Veuillez renseigner la description de la famille de l'article");
        }
        if (!StringUtils.hasLength(dto.getCodeabreger())) {
            errors.add("Veuillez renseigner le code abrege de la famille de l'article");
        }
        return errors;
    }
}
