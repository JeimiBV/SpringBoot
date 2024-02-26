package com.infsis.example.Services.Implement;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Models.Article;
import com.infsis.example.Services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public UserDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer articleId) {

    }

    private ArticleDTO articleToDTO(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }

    private Article DTOToArticle(ArticleDTO articleDTO){
        Article article = new Article();

        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());

        return article;
    }
}
