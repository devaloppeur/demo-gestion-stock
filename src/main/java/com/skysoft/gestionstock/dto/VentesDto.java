package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VentesDto {

    private Long id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    private List<LigneVenteDto> ligneVentes;

    //  Ventes -> VentesDto
    public VentesDto fromEntity(Ventes ventes) {

        if (ventes == null) {
            return null;
        }
        return VentesDto.builder()
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();
    }

    public Ventes toEntity(VentesDto ventesDto) {
        if (ventesDto == null) {
            return null;
        }

        // VentesDto -> Ventes
        Ventes ventes = new Ventes();
        ventes.setId(ventesDto.getId());
        ventes.setCode(ventesDto.getCode());
        ventes.setDateVente(ventesDto.getDateVente());
        ventes.setCommentaire(ventesDto.getCommentaire());

        return ventes;

    }
}
