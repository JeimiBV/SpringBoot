package com.infsis.example.Services.Implement;

import com.infsis.example.DTOs.BlogDTO;
import com.infsis.example.Models.Blog;
import com.infsis.example.Services.BlogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public Optional<BlogDTO> getBlogById(Integer blogId) {
        return Optional.empty();
    }

    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void delete(Integer blogId) {

    }

    private BlogDTO BlogToDto(Blog blog){
        BlogDTO blogDTO=new BlogDTO(
                blog.getName()
        );
        return blogDTO;
    }

    private Blog DtoToBlog(BlogDTO blogDTO){
        Blog blog = new Blog();

        blog.setName(blogDTO.getName());

        return blog;
    }


}
