package com.skysoft.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "articles")
public class Articles extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(name = "numarticle")
     private String numarticle;

     @Column(name = "nomarticle")
    private String nomarticle;

    @Column(name = "idAgence")
    private Integer idAgence;

     @Column(name = "description")
     private String description;

     @Column(name = "prixunitaireht")
    private BigDecimal prixunitaireht;

     @Column(name = "tauxtva")
    private BigDecimal tauxtva;

     @Column(name = "prixunitaireTtc")
    private BigDecimal prixunitairettc;

     @ManyToOne
     @JoinColumn(name = "famille", referencedColumnName = "id", nullable = false)
    private Famillearticles famillearticles;

     @OneToMany(mappedBy = "article")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

     @OneToMany(mappedBy = "article")
     private List<LigneVente> ligneVentes;
}
