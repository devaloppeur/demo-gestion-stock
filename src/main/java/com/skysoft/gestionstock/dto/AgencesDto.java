package com.skysoft.gestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skysoft.gestionstock.model.Adresse;
import com.skysoft.gestionstock.model.Agences;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import java.util.List;

@Data
@Builder
public class AgencesDto {

    private Long id;

    private String nomagence;

    private String responsable;

    private Adresse adresse;

    private String telephone;

    private String bp;

    private String niu;

    private String rc;

    private String description;

    private String codeFiscal;

    private String email;

    private String siteWeb;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;

    // Agence -> AgenceDto
    public AgencesDto fromEntity(Agences agences) {

        if (agences == null) {
            return null;
        }
        return AgencesDto.builder()
                .id(agences.getId())
                .nomagence(agences.getNomagence())
                .responsable(agences.getResponsable())
                .adresse(agences.getAdresse())
                .telephone(agences.getTelephone())
                .niu(agences.getNiu())
                .rc(agences.getRc())
                .description(agences.getDescription())
                .codeFiscal(agences.getCodeFiscal())
                .email(agences.getEmail())
                .siteWeb(agences.getSiteWeb())
                .build();
    }

    public Agences toEntity(AgencesDto agencesDto) {
        if (agencesDto == null) {
            return null;
        }

        // AgenceDto -> Agence
        Agences agences = new Agences();
        agences.setId(agencesDto.getId());
        agences.setNomagence(agencesDto.getNomagence());
        agences.setResponsable(agencesDto.getResponsable());
        agences.setAdresse(agencesDto.getAdresse());
        agences.setTelephone(agencesDto.getTelephone());
        agences.setNiu(agencesDto.getNiu());
        agences.setRc(agencesDto.getRc());
        agences.setDescription(agencesDto.getDescription());
        agences.setCodeFiscal(agencesDto.getCodeFiscal());
        agences.setEmail(agencesDto.getEmail());
        agences.setSiteWeb(agencesDto.getSiteWeb());

        return agences;

    }
}
