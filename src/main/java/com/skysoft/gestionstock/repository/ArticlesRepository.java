package com.skysoft.gestionstock.repository;

import com.skysoft.gestionstock.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArticlesRepository extends JpaRepository<Articles, Long> {

    /*Articles findArticlesByNumarticle(String numarticle) {

    }*/

    Optional<Articles> findArticlesByNumarticle(String numarticle);
}
