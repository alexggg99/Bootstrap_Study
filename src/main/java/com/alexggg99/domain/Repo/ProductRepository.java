package com.alexggg99.domain.Repo;

import com.alexggg99.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Alex on 27.11.2015.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query("select p from Product p where p.category.id = :categoryId")
    List<Product> getAllElementsByCategoryId(@Param("categoryId") long categoryId);

}
