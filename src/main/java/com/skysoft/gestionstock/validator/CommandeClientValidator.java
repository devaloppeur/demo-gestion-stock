package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {

    public static List<String> validate(CommandeClientDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le numero de la commande du client");
            errors.add("Veuillez renseigner le libelle de la commande du client");
            errors.add("Veuillez renseigner le nombre d'article de la commande du client");
            errors.add("Veuillez renseigner la date d'edition de la commande du client");
        }

        if (!StringUtils.hasLength(dto.getNumcommandeclient())) {
            errors.add("Veuillez renseigner le numero de la commande du client");
        }
        if (!StringUtils.hasLength(dto.getLibelle())) {
            errors.add("Veuillez renseigner le libelle de la commande du client");
        }
        if (dto.getNombrearticle() == null) {
            errors.add("Veuillez renseigner le nombre d'article de la commande du client");
        }
        if (dto.getDateedition() == null) {
            errors.add("Veuillez renseigner la date d'edition de la commande du client");
        }

        return errors;
    }
}
