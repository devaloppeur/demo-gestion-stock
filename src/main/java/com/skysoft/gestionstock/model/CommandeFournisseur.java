package com.skysoft.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codeCdeFsr")
    private String codeCdeFsr;

    @Column(name = "idAgence")
    private Integer idAgence;

    @Column(name = "datecommandeFsr")
    private Instant dateCommandeFsr;

    @ManyToOne
    @JoinColumn(name = "Fournisseur", referencedColumnName = "id", nullable = false)
    private Fournisseurs fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
