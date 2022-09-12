package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Long id;

    private String designation;

    private String observation;

    private Instant dateedition;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private ArticlesDto article;

    private CommandeFournisseurDto commandeFournisseur;

    // LigneCommandeFournisseur -> LigneCommandeFournisseurDto
    public LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {

        if (ligneCommandeFournisseur == null) {
            return null;
        }
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .designation(ligneCommandeFournisseur.getDesignation())
                .observation(ligneCommandeFournisseur.getObservation())
                .dateedition(ligneCommandeFournisseur.getDateedition())
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .build();
    }

    public LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        if (ligneCommandeFournisseurDto == null) {
            return null;
        }

        // ligneCommandeFournisseurDto -> ligneCommandeFournisseur
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
        ligneCommandeFournisseur.setDesignation(ligneCommandeFournisseurDto.getDesignation());
        ligneCommandeFournisseur.setObservation(ligneCommandeFournisseurDto.getObservation());
        ligneCommandeFournisseur.setDateedition(ligneCommandeFournisseurDto.getDateedition());
        ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseurDto.getQuantite());
        ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire());

        return ligneCommandeFournisseur;

    }
}
