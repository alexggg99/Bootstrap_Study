package com.alexggg99.web;

import com.alexggg99.domain.Category;
import com.alexggg99.domain.Product;
import com.alexggg99.domain.Repo.CategoryRepository;
import com.alexggg99.domain.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alexggg99 on 02.07.15.
 */

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getAll() {
        List<Product> result = (List<Product>) productRepository.findAll();
        return result;
    }

    @RequestMapping("/index")
    public String mainpage() {
        return "views/index";
    }


    @RequestMapping("/greeting")
    @ResponseBody
    public String json(){
        return "{\"id\":1,\"content\":\"Hello, World!\"}";
    }



}
