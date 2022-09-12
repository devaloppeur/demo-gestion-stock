package com.skysoft.gestionstock.repository;

import com.skysoft.gestionstock.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients, Integer> {
}
