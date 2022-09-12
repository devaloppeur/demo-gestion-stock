package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private Long id;

    private String codeCdeFsr;

    private Instant dateCommandeFsr;

    private FournisseursDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

    // CommandeFournisseur -> CommandeFournisseurDto
    public CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {

        if (commandeFournisseur == null) {
            return null;
        }
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .codeCdeFsr(commandeFournisseur.getCodeCdeFsr())
                .dateCommandeFsr(commandeFournisseur.getDateCommandeFsr())
                .build();
    }

    public CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto) {
        if (commandeFournisseurDto == null) {
            return null;
        }

        // commandeClientDto -> CommandeClient
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCodeCdeFsr(commandeFournisseurDto.getCodeCdeFsr());
        commandeFournisseur.setDateCommandeFsr(commandeFournisseurDto.getDateCommandeFsr());

        return commandeFournisseur;

    }
}
