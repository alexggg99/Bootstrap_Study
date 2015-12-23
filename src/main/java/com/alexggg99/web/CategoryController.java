package com.alexggg99.web;

import com.alexggg99.domain.Category;
import com.alexggg99.domain.Product;
import com.alexggg99.domain.Repo.CategoryRepository;
import com.alexggg99.domain.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alexggg99 on 02.07.15.
 */

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> getAll() {
        List<Category> result = (List<Category>) categoryRepository.findAll();
        return result;
    }

}
