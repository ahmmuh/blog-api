package se.codeanytime.sampeapi.blog.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.codeanytime.sampeapi.blog.model.Blog;
import se.codeanytime.sampeapi.blog.service.BlogService;

import java.util.List;

@RestController
public class BlogController {
    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blogs/all")
    public ResponseEntity<List<Blog>> getAllBlog(){
        List<Blog> blog = blogService.getAllBlogs();
        return new ResponseEntity<>( blog, HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable("id") Long id){
        Blog blog = blogService.getBlogById(id);
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog){
        Blog newBlog = blogService.addBlog(blog);
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }
    @PutMapping("/blog/{id}")
    public ResponseEntity<Blog>  updateBlog( @RequestBody Blog blog){
        Blog updateBlog = blogService.updateBlog(blog);
        return new ResponseEntity<>(updateBlog, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable("id") Long id){
        blogService.deleteBlog(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}