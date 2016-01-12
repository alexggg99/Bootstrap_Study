package com.alexggg99.domain.Repo;

import com.alexggg99.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


/**
 * Created by Alex on 27.11.2015.
 */
public interface ProductRepositoryPageable extends PagingAndSortingRepository<Product, Long> {

    @Query("select p from Product p where p.category.id = :categoryId")
    Page<Product> findByCategoryId(@Param("categoryId") long categoryId, Pageable pageable);
}
