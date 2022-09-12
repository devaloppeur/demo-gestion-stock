package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Long id;

    private String roleNom;

    private UtilisateurDto utilisateur;

    // Roles -> RolesDto
    public RolesDto fromEntity(Roles roles) {

        if (roles == null) {
            return null;
        }
        return RolesDto.builder()
                .roleNom(roles.getRoleNom())
                .build();
    }

    public Roles toEntity(RolesDto rolesDto) {
        if (rolesDto == null) {
            return null;
        }

        // rolesDto -> Roles
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRoleNom(rolesDto.getRoleNom());

        return roles;

    }
}
