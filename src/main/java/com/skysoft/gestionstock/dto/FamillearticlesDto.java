package com.skysoft.gestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skysoft.gestionstock.model.Famillearticles;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.util.List;

@Data
@Builder
public class FamillearticlesDto {

    public static Object fromEntity;
    private Long id;

    private String numfamille;

    private String libelle;

    private String description;

    private String codeabreger;

    @JsonIgnore
    private List<ArticlesDto> articles;

    public static FamillearticlesDto fromEntity(Famillearticles famillearticles) {
        if (famillearticles == null) {
            return null;
        }

        //Categorie -> CategorieDto
        return FamillearticlesDto.builder()
                .id(famillearticles.getId())
                .numfamille(famillearticles.getNumfamille())
                .libelle(famillearticles.getLibelle())
                .description(famillearticles.getDescription())
                .codeabreger(famillearticles.getCodeabreger())
                // Cette methode build() va construire un objet de type CategorieDto avec les infos ci-dessus.
                .build();
    }

    public Famillearticles toEntity(FamillearticlesDto famillearticlesDto) {
        if (famillearticlesDto == null) {
            return null;
        }

        // CategorieDto -> Categorie
        Famillearticles famillearticles = new Famillearticles();
        famillearticles.setId(famillearticlesDto.getId());
        famillearticles.setNumfamille(famillearticlesDto.getNumfamille());
        famillearticles.setLibelle(famillearticlesDto.getLibelle());
        famillearticles.setDescription(famillearticlesDto.getDescription());
        famillearticles.setCodeabreger(famillearticlesDto.getCodeabreger());

        return famillearticles;

    }
}
