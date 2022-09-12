package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.AgencesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AgencesValidator {

    public static List<String> validate(AgencesDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {

            errors.add("Veuillez renseigner le nom de l'agence");
            errors.add("Veuillez renseigner le nom du responsable");
            errors.add("Veuillez renseigner l'adresse de l'agence");
            errors.add("Le champs 'Adresse 1' est obligatoire");
            errors.add("Le champs 'Ville' est obligatoire");
            errors.add("Le champs 'Code postale' est obligatoire");
            errors.add("Le champs 'Pays' est obligatoire");
            errors.add("Veuillez renseigner le numero de telephone de l'agence");
            errors.add("Veuillez renseigner le NIU de l'agence");
            errors.add("Veuillez renseigner le RC de l'agence");
            errors.add("Veuillez renseigner la description de l'agence");
            errors.add("Veuillez renseigner le code fiscal de l'agence");
            errors.add("Veuillez renseigner l'email de l'agence");
            errors.add("Veuillez renseigner le numero de telephone de l'agence");
            errors.add("Veuillez renseigner le site web de l'agence");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNomagence())) {
            errors.add("Veuillez renseigner le nom de l'agence");
        }
        if (!StringUtils.hasLength(dto.getResponsable())) {
            errors.add("Veuillez renseigner le nom du responsable");
        }
        if (dto.getAdresse() == null) {
            errors.add("Veuillez renseigner l'adresse de l'agence");
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
        if (!StringUtils.hasLength(dto.getTelephone())) {
            errors.add("Veuillez renseigner le numero de telephone de l'agence");
        }
        if (!StringUtils.hasLength(dto.getNiu())) {
            errors.add("Veuillez renseigner le NIU de l'agence");
        }
        if (!StringUtils.hasLength(dto.getRc())) {
            errors.add("Veuillez renseigner le RC de l'agence");
        }
        if (!StringUtils.hasLength(dto.getDescription())) {
            errors.add("Veuillez renseigner la description de l'agence");
        }
        if (!StringUtils.hasLength(dto.getCodeFiscal())) {
            errors.add("Veuillez renseigner le code fiscal de l'agence");
        }
        if (!StringUtils.hasLength(dto.getEmail())) {
            errors.add("Veuillez renseigner l'email de l'agence");
        }
        if (!StringUtils.hasLength(dto.getSiteWeb())) {
            errors.add("Veuillez renseigner le site web de l'agence");
        }

        return errors;
    }
}
