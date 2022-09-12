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
@Table(name = "MvtStk")
public class MvtStk extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nummouvement")
    private String nummouvement;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "idAgence")
    private Integer idAgence;

    @Column(name = "dateMvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "article", referencedColumnName = "id", nullable = false)
    private Articles article;

}
