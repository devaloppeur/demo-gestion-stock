package com.skysoft.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "roleName")
    private String roleNom;

    @Column(name = "idAgence")
    private Integer idAgence;

    @ManyToOne
    @JoinColumn(name = "utilisateur", referencedColumnName = "id", nullable = false)
    private Utilisateur utilisateur;
}
