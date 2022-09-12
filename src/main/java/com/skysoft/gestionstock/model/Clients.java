package com.skysoft.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class Clients extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numclient")
    private String numclient;

    @Column(name = "nomcomplet")
    private String nomcomplet;

    @Column(name = "idAgence")
    private Integer idAgence;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "contribuable")
    private String contribuable;

    @Column(name = "registrecommerce")
    private String registrecommerce;

    @Column(name = "appliedtva")
    private String appliedtva;

    @Embedded
    private Adresse adresse;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "credible")
    private Boolean credible = false;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
