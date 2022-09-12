package com.skysoft.gestionstock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "typeMvtStk")
public class TypeMvtStk {


    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "idAgence")
    private Integer idAgence;
}
