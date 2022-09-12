package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.LigneCommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {

    public static List<String> validate(LigneCommandeClientDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {

            errors.add("Veuillez renseigner la designation de la ligne de commande client");
            errors.add("Veuillez renseigner l'observation de la ligne de commande client");
            errors.add("Veuillez renseigner la quantite de la ligne de commande client");
            errors.add("Veuillez renseigner le prix unitaire de la ligne de commande client");
        }

        if (!StringUtils.hasLength(dto.getDesignation())) {
            errors.add("Veuillez renseigner la designation de la ligne de commande client");
        }
        if (!StringUtils.hasLength(dto.getObservation())) {
            errors.add("Veuillez renseigner l'observation de la ligne de commande client");
        }
        if (dto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantite de la ligne de commande client");
        }
        if (dto.getPrixUnitaire() == null) {
            errors.add("Veuillez renseigner le prix unitaire de la ligne de commande client");
        }

        return errors;
    }
}
