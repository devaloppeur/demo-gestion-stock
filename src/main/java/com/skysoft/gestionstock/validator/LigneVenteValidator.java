package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.LigneVenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {

    public static List<String> validate(LigneVenteDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {

            errors.add("Veuillez renseigner le libelle de la ligne de vente");
            errors.add("Veuillez renseigner la quantite de la ligne de vente");
            errors.add("Veuillez renseigner le prix unitaire de la ligne de vente");
        }

        if (!StringUtils.hasLength(dto.getLibelle())) {
            errors.add("Veuillez renseigner le libelle de la ligne de vente");
        }
        if (dto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantite de la ligne de vente");
        }
        if (dto.getPrixUnitaire() == null) {
            errors.add("Veuillez renseigner le prix unitaire de la ligne de vente");
        }

        return errors;
    }
}
