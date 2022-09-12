package com.skysoft.gestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skysoft.gestionstock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Long id;

    private String numcommandeclient;

    private Boolean active;

    private String libelle;

    private String observation;

    private Double nombrearticle;

    private Instant dateedition;

    private ClientsDto client;

    @JsonIgnore
    private List<LigneCommandeClientDto> ligneCommandeClients;

    // CommandeClient -> CommandeClientDto
    public CommandeClientDto fromEntity(CommandeClient commandeClient) {

        if (commandeClient == null) {
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .numcommandeclient(commandeClient.getNumcommandeclient())
                .active(commandeClient.getActive())
                .libelle(commandeClient.getLibelle())
                .observation(commandeClient.getObservation())
                .nombrearticle(commandeClient.getNombrearticle())
                .dateedition(commandeClient.getDateedition())
                .build();
    }

    public CommandeClient toEntity(CommandeClientDto commandeClientDto) {
        if (commandeClientDto == null) {
            return null;
        }

        // commandeClientDto -> CommandeClient
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setNumcommandeclient(commandeClientDto.getNumcommandeclient());
        commandeClient.setActive(commandeClientDto.getActive());
        commandeClient.setLibelle(commandeClientDto.getLibelle());
        commandeClient.setObservation(commandeClientDto.getObservation());
        commandeClient.setNombrearticle(commandeClientDto.getNombrearticle());
        commandeClient.setDateedition(commandeClientDto.getDateedition());

        return commandeClient;

    }
}
