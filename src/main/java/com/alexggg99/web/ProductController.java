package com.alexggg99.web;

import com.alexggg99.domain.Category;
import com.alexggg99.domain.Product;
import com.alexggg99.domain.Repo.CategoryRepository;
import com.alexggg99.domain.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/getAll" ,method = RequestMethod.GET)
    public @ResponseBody List<Product> getAll() {
        List<Product> result = (List<Product>) productRepository.findAll();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String productPage() {
        return "views/product";
    }

    @RequestMapping(value = "/{productId}" ,method = RequestMethod.GET)
    public @ResponseBody Product getProductById(@PathVariable long productId){
        Product product = productRepository.findOne(productId);
        return product;
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public String json(){
        return "{\"id\":1,\"content\":\"Hello, World!\"}";
    }

}
