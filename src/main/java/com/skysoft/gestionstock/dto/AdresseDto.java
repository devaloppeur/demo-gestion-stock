package com.skysoft.gestionstock.dto;


import com.skysoft.gestionstock.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

    private Long id;

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;

    // Adresse -> AdresseDto
    public AdresseDto fromEntity(Adresse adresse) {
        if (adresse == null) {

            return null;
        }

        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .build();
    }

    public Adresse toEntity(AdresseDto adresseDto) {

        if (adresseDto == null) {
            return null;
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getVille());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setPays(adresseDto.getPays());
        return adresse;
    }
}