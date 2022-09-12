package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.FournisseursDto;
import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class FournisseursValidator {

    public static List<String> validate(FournisseursDto dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le numero du fournisseur");
            errors.add("Veuillez renseigner le nom complet du fournisseur");
            errors.add("Veuillez renseigner l'adresse du fournisseur");
            errors.add("Le champs 'Adresse 1' est obligatoire");
            errors.add("Le champs 'Ville' est obligatoire");
            errors.add("Le champs 'Code postale' est obligatoire");
            errors.add("Le champs 'Pays' est obligatoire");
            errors.add("Veuillez renseigner l'email du fournisseur");
            errors.add("Veuillez renseigner le numero de telephone du fournisseur");
            errors.add("Veuillez renseigner le RC du fournisseur");
            errors.add("Veuillez renseigner le NC du fournisseur");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNumfournisseur())) {
            errors.add("Veuillez renseigner le numero du fournisseur");
        }
        if (!StringUtils.hasLength(dto.getNomcomplet())) {
            errors.add("Veuillez renseigner le nom complet du fournisseur");
        }
        if (dto.getAdresse() == null) {
            errors.add("Veuillez renseigner l'adresse du fournisseur");
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
        if (!StringUtils.hasLength(dto.getEmail())) {
            errors.add("Veuillez renseigner l'email du fournisseur");
        }
        if (!StringUtils.hasLength(dto.getTelephone())) {
            errors.add("Veuillez renseigner le numero de telephone du fournisseur");
        }
        if (!StringUtils.hasLength(dto.getRegistrecommerce())) {
            errors.add("Veuillez renseigner le RC du fournisseur");
        }
        if (!StringUtils.hasLength(dto.getContribuable())) {
            errors.add("Veuillez renseigner le NC du fournisseur");
        }

        return errors;
    }
}
