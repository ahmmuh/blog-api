package se.codeanytime.sampeapi.blog.blogRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.codeanytime.sampeapi.blog.model.Blog;

public interface BlogRepo extends JpaRepository<Blog, Long> {

    Blog getBlogById(Long id);

    Blog deleteBlog(Long id);
}
