package com.skysoft.gestionstock.validator;

import com.skysoft.gestionstock.dto.RolesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RolesValidator {

    public static List<String> validate(RolesDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le nom du role");
            return errors;
        }
        if (!StringUtils.hasLength(dto.getRoleNom())) {
            errors.add("Veuillez renseigner le nom du role");
        }
        return errors;
    }
}
