package com.infsis.example.Services;

import com.infsis.example.DTOs.BlogDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BlogService {
    Optional<BlogDTO> getBlogById(Integer blogId);
    BlogDTO saveBlog (BlogDTO blogDTO);
    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete(Integer blogId);

}
