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
@Table(name = "fournisseurs")
public class Fournisseurs extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numfournisseur")
    private String numfournisseur;

    @Column(name = "nomcomplet")
    private String nomcomplet;

    @Column(name = "idAgence")
    private Integer idAgence;

    @Embedded
    private Adresse adresse;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "registrecommerce")
    private String registrecommerce;

    @Column(name = "contribuable")
    private String contribuable;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
}
