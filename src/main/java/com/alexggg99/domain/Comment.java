package com.alexggg99.domain;

import javax.persistence.*;

/**
 * Created by alexggg99 on 18.12.15.
 */


@Entity
@Table(name = "comments")
public class Comment {

    public Comment() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String author;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
