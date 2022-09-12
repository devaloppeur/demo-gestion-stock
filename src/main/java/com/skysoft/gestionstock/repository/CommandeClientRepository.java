package com.skysoft.gestionstock.repository;

import com.skysoft.gestionstock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {
}
