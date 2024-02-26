package com.infsis.example.Services;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ArticleService {
    Optional<ArticleDTO> getArticleById(Integer articleId);
    UserDTO saveArticle (ArticleDTO articleDTO);
    UserDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void delete(Integer articleId);
}
