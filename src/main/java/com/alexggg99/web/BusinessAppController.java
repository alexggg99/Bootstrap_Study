package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("bussines_app")
public class BusinessAppController {

    @RequestMapping(value = "/index")
    public String home(){
        return "projects/bussines_app/index";
    }

    @RequestMapping(value = "/about")
    public String about(){
        return "projects/bussines_app/about";
    }

    @RequestMapping(value = "/services")
    public String services(){
        return "projects/bussines_app/services";
    }

    @RequestMapping(value = "/contact")
    public String contact(){
        return "projects/bussines_app/contact";
    }

}
