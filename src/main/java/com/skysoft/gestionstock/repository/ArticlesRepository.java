package com.skysoft.gestionstock.repository;

import com.skysoft.gestionstock.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticlesRepository extends JpaRepository<Articles, Integer> {

    /*Articles findArticlesByNumarticle(String numarticle) {

    }*/
}
