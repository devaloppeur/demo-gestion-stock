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
@Table(name = "agences")
public class Agences extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomagence")
    private String nomagence;

    @Column(name = "responsable")
    private String responsable;

    @Embedded
    private Adresse adresse;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "niu")
    private String niu;

    @Column(name = "rc")
    private String rc;

    @Column(name = "description")
    private String description;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "email")
    private String email;

    @Column(name = "siteWeb")
    private String siteWeb;

    @OneToMany(mappedBy = "agences")
    private List<Utilisateur> utilisateurs;
}
