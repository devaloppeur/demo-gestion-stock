package com.skysoft.gestionstock.repository;

import com.skysoft.gestionstock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Ventes, Integer> {
}
