package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("ecommerce_app")
public class EcommerceController {

    @RequestMapping(value = "/index")
    public String home(){
        return "projects/ecommerce_app/index";
    }

    @RequestMapping(value = "/product")
    public String product(){
        return "projects/ecommerce_app/product";
    }

}
