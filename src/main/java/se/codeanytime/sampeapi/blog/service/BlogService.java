package se.codeanytime.sampeapi.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import se.codeanytime.sampeapi.blog.blogRepo.BlogRepo;
import se.codeanytime.sampeapi.blog.model.Blog;

import java.util.List;

@Service
public class BlogService {
    private final BlogRepo blogRepo;

    @Autowired
    public BlogService(BlogRepo blogRepo) {
        this.blogRepo = blogRepo;
    }
    public List<Blog> getAllBlogs(){
        return this.blogRepo.findAll();
    }

    public Blog getBlogById(Long id){
        return this.blogRepo.getBlogById(id);
    }

    public Blog addBlog(Blog blog){
        return blogRepo.save(blog);
    }

    public Blog updateBlog(Blog blog){
        return this.blogRepo.save(blog);
    }


    public Blog deleteBlog(Long id){
        return this.blogRepo.deleteBlog(id);
    }

}
