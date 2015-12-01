package com.alexggg99.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Alex on 27.11.2015.
 */

@Entity
@Table(name = "pages")
public class Page implements Serializable {

    private static final long serialVersionUID = -1801714432822866390L;

    public Page() {
    }

    public Page(String title, Category category, String author) {
        this.title = title;
        Category = category;
        Author = author;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category Category;

    @Column(name = "author")
    private String Author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public com.alexggg99.domain.Category getCategory() {
        return Category;
    }

    public void setCategory(com.alexggg99.domain.Category category) {
        Category = category;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
