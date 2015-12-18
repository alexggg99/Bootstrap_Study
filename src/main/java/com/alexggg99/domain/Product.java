package com.alexggg99.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Alex on 27.11.2015.
 */

@Entity
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = -1801714432822866390L;

    public Product() {
    }

    public Product(String title, Category category, Double price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "price")
    private Double price;

    @Column(name = "spec")
    private String spec;

    @Column(name = "image_url")
    private String imageURL;

//    @OneToMany(mappedBy = "product")
//    private List<Comment> comments;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

//    public List<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<Comment> comments) {
//        this.comments = comments;
//    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
