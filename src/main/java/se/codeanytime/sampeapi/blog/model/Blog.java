package se.codeanytime.sampeapi.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String body;
    private String author;

    public Blog() {
    }

    public Blog(Long id,
                String title,
                String body,
                String author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
