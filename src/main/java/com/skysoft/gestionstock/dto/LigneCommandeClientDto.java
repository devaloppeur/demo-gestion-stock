package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class LigneCommandeClientDto {

    private Long id;

    private String designation;

    private String observation;

    private Instant dateedition;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private ArticlesDto article;

    private CommandeClientDto commandeClient;

    // LigneCommandeClient -> LigneCommandeClientDto
    public LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient) {

        if (ligneCommandeClient == null) {
            return null;
        }
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .designation(ligneCommandeClient.getDesignation())
                .observation(ligneCommandeClient.getObservation())
                .dateedition(ligneCommandeClient.getDateedition())
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();
    }

    public LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto) {
        if (ligneCommandeClientDto == null) {
            return null;
        }

        // ligneCommandeClientDto -> ligneCommandeClient
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClientDto.getId());
        ligneCommandeClient.setDesignation(ligneCommandeClientDto.getDesignation());
        ligneCommandeClient.setObservation(ligneCommandeClientDto.getObservation());
        ligneCommandeClient.setDateedition(ligneCommandeClientDto.getDateedition());
        ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());

        return ligneCommandeClient;

    }
}
