package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.MvtStkDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MvtStkValidator {

    public static List<String> validate(MvtStkDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le numero du mouvement, de stock");
            errors.add("Veuillez renseigner le libelle du mouvement, de stock");
            errors.add("Veuillez renseigner la quantite du mouvement de stock");
            return errors;
        }
        if (!StringUtils.hasLength(dto.getNummouvement())) {
            errors.add("Veuillez renseigner le numero du mouvement, de stock");
        }
        if (!StringUtils.hasLength(dto.getLibelle())) {
            errors.add("Veuillez renseigner le libelle du mouvement, de stock");
        }
        if (dto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantite du mouvement de stock");
        }

        return errors;
    }
}
