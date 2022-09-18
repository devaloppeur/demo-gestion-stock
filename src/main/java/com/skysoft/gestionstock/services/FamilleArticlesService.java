package com.skysoft.gestionstock.services;

import com.skysoft.gestionstock.dto.FamillearticlesDto;

import java.util.List;

public interface FamilleArticlesService {

    FamillearticlesDto save(FamillearticlesDto dto);

    FamillearticlesDto findById(Long id);

    FamillearticlesDto numfamille(String numfamille);

    List<FamillearticlesDto> findAll();

    void delete(Long id);
}
