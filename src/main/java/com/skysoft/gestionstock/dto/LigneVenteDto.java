package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Long id;

    private String libelle;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private ArticlesDto article;

    // LigneVente -> LigneVenteDto
    public LigneVenteDto fromEntity(LigneVente ligneVente) {

        if (ligneVente == null) {
            return null;
        }
        return LigneVenteDto.builder()
                .quantite(ligneVente.getQuantite())
                .build();
    }

    public LigneVente toEntity(LigneVenteDto ligneVenteDto) {
        if (ligneVenteDto == null) {
            return null;
        }

        // LigneVenteDto -> LigneVente
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());

        return ligneVente;

    }
}
