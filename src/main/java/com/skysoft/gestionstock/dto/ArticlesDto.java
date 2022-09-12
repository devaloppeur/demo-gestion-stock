package com.skysoft.gestionstock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skysoft.gestionstock.model.Articles;
import com.skysoft.gestionstock.model.Famillearticles;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
public class ArticlesDto {

    private Long id;

    private String numarticle;

    private String nomarticle;

    private String description;

    private BigDecimal prixunitaireht;

    private BigDecimal tauxtva;

    private BigDecimal prixunitairettc;

    private Famillearticles famillearticles;

    @JsonIgnore
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

    // Articles -> ArticleDto
    public static ArticlesDto fromEntity(Articles article) {

        if (article == null) {
            return null;
        }
         return ArticlesDto.builder()
                 .id(article.getId())
                 .numarticle(article.getNumarticle())
                 .nomarticle(article.getNomarticle())
                 .description(article.getDescription())
                 .prixunitaireht(article.getPrixunitaireht())
                 .tauxtva(article.getTauxtva())
                 .prixunitairettc(article.getPrixunitairettc())
                 .build();
    }

    public static Articles toEntity(ArticlesDto articleDto) {
        if (articleDto == null) {
            return null;
        }

        // ArticleDto -> Articles
        Articles article = new Articles();
        article.setId(articleDto.getId());
        article.setNumarticle(articleDto.getNumarticle());
        article.setNomarticle(articleDto.getNomarticle());
        article.setDescription(articleDto.getDescription());
        article.setPrixunitaireht(articleDto.getPrixunitaireht());
        article.setTauxtva(articleDto.getTauxtva());
        article.setPrixunitairettc(articleDto.getPrixunitairettc());

        return article;

    }
}
