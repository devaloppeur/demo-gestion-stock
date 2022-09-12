package com.skysoft.gestionstock.dto;

import com.skysoft.gestionstock.model.Adresse;
import com.skysoft.gestionstock.model.Fournisseurs;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseursDto {

    private Long id;

    private String numfournisseur;

    private String nomcomplet;

    private Adresse adresse;

    private String telephone;

    private String registrecommerce;

    private String contribuable;

    private String email;

    private List<CommandeFournisseurDto> commandeFournisseurs;

    // Fournisseur -> FournisseurDto
    public FournisseursDto fromEntity(Fournisseurs fournisseur) {

        if (fournisseur == null) {
            return null;
        }
        return FournisseursDto.builder()
                .numfournisseur(fournisseur.getNumfournisseur())
                .nomcomplet(fournisseur.getNomcomplet())
                .adresse(fournisseur.getAdresse())
                .email(fournisseur.getEmail())
                .telephone(fournisseur.getTelephone())
                .registrecommerce(fournisseur.getRegistrecommerce())
                .contribuable(fournisseur.getContribuable())
                .build();
    }

    public Fournisseurs toEntity(FournisseursDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;
        }

        // fournisseurDto -> Fournisseur
        Fournisseurs fournisseur = new Fournisseurs();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNumfournisseur(fournisseurDto.getNumfournisseur());
        fournisseur.setNomcomplet(fournisseurDto.getNomcomplet());
        fournisseur.setAdresse(fournisseurDto.getAdresse());
        fournisseur.setEmail(fournisseurDto.getEmail());
        fournisseur.setTelephone(fournisseurDto.getTelephone());
        fournisseur.setRegistrecommerce(fournisseurDto.getRegistrecommerce());
        fournisseur.setContribuable(fournisseurDto.getContribuable());

        return fournisseur;

    }
}
