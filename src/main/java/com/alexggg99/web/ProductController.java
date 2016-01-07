package com.alexggg99.web;

import com.alexggg99.domain.Category;
import com.alexggg99.domain.Product;
import com.alexggg99.domain.Repo.CategoryRepository;
import com.alexggg99.domain.Repo.ProductRepository;
import com.alexggg99.domain.Repo.UserRepository;
import com.alexggg99.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/getAll" ,method = RequestMethod.GET)
    public @ResponseBody List<Product> getAll() {
        List<Product> result = (List<Product>) productRepository.findAll();
        return result;
    }

    @RequestMapping("/view")
    public String productPage() {
        return "views/product";
    }

    @RequestMapping(value = "/{productId}" ,method = RequestMethod.GET)
    public @ResponseBody Product getProductById(@PathVariable long productId){
        Product product = productRepository.findOne(productId);
        return product;
    }

    @RequestMapping("/buy")
    public ResponseEntity<String> buyProduct(@RequestBody Product product){
        //check if user authonticated
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();
        if (auth instanceof AnonymousAuthenticationToken) {

            return new ResponseEntity<String>("{\"status\" : \"FORBIDDEN\"}", HttpStatus.FORBIDDEN);
        }
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        return new ResponseEntity<String>("{\"email\" : \"" + user.getEmail() + "\"}", HttpStatus.OK);
    }

}
