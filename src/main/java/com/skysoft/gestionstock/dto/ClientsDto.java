package com.skysoft.gestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skysoft.gestionstock.model.Adresse;
import com.skysoft.gestionstock.model.Clients;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientsDto {

    private Long id;

    private String numclient;

    private String nomcomplet;

    private String telephone;

    private String email;

    private String contribuable;

    private String registrecommerce;

    private String appliedtva;

    private Adresse adresse;

    private Boolean active;

    private Boolean credible = false;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    // Client -> ClientDto
    public ClientsDto fromEntity(Clients client) {

        if (client == null) {
            return null;
        }
        return ClientsDto.builder()
                .numclient(client.getNumclient())
                .nomcomplet(client.getNomcomplet())
                .telephone(client.getTelephone())
                .email(client.getEmail())
                .contribuable(client.getContribuable())
                .registrecommerce(client.getRegistrecommerce())
                .appliedtva(client.getAppliedtva())
                .adresse(client.getAdresse())
                .active(client.getActive())
                .credible(client.getCredible())
                .build();
    }

    public Clients toEntity(ClientsDto clientsDto) {
        if (clientsDto == null) {
            return null;
        }

        // ClientDto -> Client
        Clients clients = new Clients();
        clients.setId(clientsDto.getId());
        clients.setNumclient(clientsDto.getNumclient());
        clients.setNomcomplet(clientsDto.getNomcomplet());
        clients.setTelephone(clientsDto.getTelephone());
        clients.setEmail(clientsDto.getEmail());
        clients.setContribuable(clientsDto.getContribuable());
        clients.setRegistrecommerce(clientsDto.getRegistrecommerce());
        clients.setAppliedtva(clientsDto.getAppliedtva());
        clients.setAdresse(clientsDto.getAdresse());
        clients.setActive(clientsDto.getActive());
        clients.setCredible(clientsDto.getCredible());

        return clients;

    }
}
