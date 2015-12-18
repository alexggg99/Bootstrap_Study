package com.alexggg99.domain.Repo;

import com.alexggg99.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alex on 27.11.2015.
 */
public interface CommentRepository extends CrudRepository<Product, Long> {
}
