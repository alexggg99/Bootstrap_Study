package com.alexggg99.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("app_sales")
public class AppSalesController {

    @RequestMapping(value = "/about")
    public String home(){
        return "projects/app_sales/about";
    }

    @RequestMapping(value = "/content")
    public String content(){
        return "projects/app_sales/content";
    }

}
