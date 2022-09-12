package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.MvtStk;
import com.skysoft.gestionstock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Long id;

    private String nummouvement;

    private String libelle;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvtStk;

    private ArticlesDto article;

    // MvtStk -> MvtStkDto
    public MvtStkDto fromEntity(MvtStk mvtStk) {

        if (mvtStk == null) {
            return null;
        }
        return MvtStkDto.builder()
                .nummouvement(mvtStk.getNummouvement())
                .libelle(mvtStk.getLibelle())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .build();
    }

    public MvtStk toEntity(MvtStkDto mvtStkDto) {
        if (mvtStkDto == null) {
            return null;
        }

        // MvtStkDto -> MvtStk
        MvtStk mvtStk = new MvtStk();
        mvtStk.setNummouvement(mvtStkDto.getNummouvement());
        mvtStk.setLibelle(mvtStkDto.getLibelle());
        mvtStk.setDateMvt(mvtStkDto.getDateMvt());
        mvtStk.setQuantite(mvtStkDto.getQuantite());

        return mvtStk;

    }
}
