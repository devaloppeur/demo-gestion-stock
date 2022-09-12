package com.skysoft.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "observation")
    private String observation;

    @Column(name = "idAgence")
    private Integer idAgence;

    @Column(name = "dateedition")
    private Instant dateedition;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "article", referencedColumnName = "id", nullable = false)
    private Articles article;

    @ManyToOne
    @JoinColumn(name = "commandeClient", referencedColumnName = "id", nullable = false)
    private CommandeClient commandeClient;

}
