package com.alexggg99.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("agency_app")
public class AppAgencyController {

    @RequestMapping(value = "/index")
    public String home(){
        return "projects/agency_app/index";
    }

    @RequestMapping(value = "/content")
    public String content(){
        return "projects/app_sales/content";
    }

}
