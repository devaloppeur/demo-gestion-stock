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
@Table(name = "famillearticles")
public class Famillearticles extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numfamille")
    private String numfamille;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "idAgence")
    private Integer idAgence;

    @Column(name = "description")
    private String description;

    @Column(name = "codeabreger")
    private String codeabreger;

    @OneToMany(mappedBy = "famillearticles")
    private List<Articles> articles;

}
