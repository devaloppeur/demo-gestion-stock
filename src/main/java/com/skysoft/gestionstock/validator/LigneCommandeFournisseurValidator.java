package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.LigneCommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {

    public static List<String> validate(LigneCommandeFournisseurDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {

            errors.add("Veuillez renseigner la designation de la commande");
            errors.add("Veuillez renseigner l'observation de la commande");
            errors.add("Veuillez renseigner le prix unitaire de la ligne commande fournisseur");
            errors.add("Veuillez renseigner la quantite de la ligne commande fournisseur");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getDesignation())) {
            errors.add("Veuillez renseigner la designation de la commande");
        }
        if (!StringUtils.hasLength(dto.getObservation())) {
            errors.add("Veuillez renseigner l'observation de la commande");
        }
        if (dto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantite de la commande");
        }
        if (dto.getPrixUnitaire() == null) {
            errors.add("Veuillez renseigner le prix unitaire de la commande");
        }

        return errors;
    }
}
