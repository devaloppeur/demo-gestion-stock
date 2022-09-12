package com.skysoft.gestionstock.repository;

import com.skysoft.gestionstock.model.Agences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencesRepository extends JpaRepository<Agences, Integer> {
}
