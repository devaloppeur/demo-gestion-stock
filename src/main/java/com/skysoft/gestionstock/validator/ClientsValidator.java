package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.ClientsDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientsValidator {

    public static List<String> validate(ClientsDto dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le numero du client");
            errors.add("Veuillez renseigner le nom complet du client");
            errors.add("Veuillez renseigner le telephone du client");
            errors.add("Veuillez renseigner l'email du client");
            errors.add("Veuillez renseigner le contribuable du client");
            errors.add("Veuillez renseigner le registre de commerce du client");
            errors.add("Veuillez renseigner la TVA du client");
            errors.add("Veuillez renseigner l'adresse du client");
            errors.add("Le champs 'Adresse 1' est obligatoire");
            errors.add("Le champs 'Ville' est obligatoire");
            errors.add("Le champs 'Code postale' est obligatoire");
            errors.add("Le champs 'Pays' est obligatoire");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNumclient())) {
            errors.add("Veuillez renseigner le numero du client");
        }
        if (!StringUtils.hasLength(dto.getNomcomplet())) {
            errors.add("Veuillez renseigner le nom complet du client");
        }
        if (!StringUtils.hasLength(dto.getTelephone())) {
            errors.add("Veuillez renseigner le telephone du client");
        }
        if (!StringUtils.hasLength(dto.getEmail())) {
            errors.add("Veuillez renseigner l'email du client");
        }
        if (!StringUtils.hasLength(dto.getContribuable())) {
            errors.add("Veuillez renseigner le contribuable du client");
        }
        if (!StringUtils.hasLength(dto.getRegistrecommerce())) {
            errors.add("Veuillez renseigner le registre de commerce du client");
        }
        if (!StringUtils.hasLength(dto.getAppliedtva())) {
            errors.add("Veuillez renseigner la TVA du client");
        }
        if (dto.getAdresse() == null) {
            errors.add("Veuillez renseigner l'adresse du client");
        } else {

            if (!StringUtils.hasLength(dto.getAdresse().getAdresse1())) {
                errors.add("Le champs 'Adresse 1' est obligatoire");
            }
            if (!StringUtils.hasLength(dto.getAdresse().getVille())) {
                errors.add("Le champs 'Ville' est obligatoire");
            }
            if (!StringUtils.hasLength(dto.getAdresse().getCodePostale())) {
                errors.add("Le champs 'Code postale' est obligatoire");
            }
            if (!StringUtils.hasLength(dto.getAdresse().getPays())) {
                errors.add("Le champs 'Pays' est obligatoire");
            }
        }

        return errors;
    }
}
