package com.skysoft.gestionstock.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numcommande")
    private String numcommandeclient;

    @Column(name = "idAgence")
    private Integer idAgence;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "observation")
    private String observation;

    @Column(name = "nombrearticle")
    private Double nombrearticle;

    @Column(name = "dateedition")
    private Instant dateedition;

    @ManyToOne
    @JoinColumn(name = "client", referencedColumnName = "id", nullable = false)
    private Clients client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
