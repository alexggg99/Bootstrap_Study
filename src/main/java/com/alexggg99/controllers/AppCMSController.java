package com.alexggg99.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("cms_app")
public class AppCMSController {

    @RequestMapping(value = "/login")
    public String home(){
        return "projects/cms_app/login";
    }

    @RequestMapping(value = "/index")
    public String content(){
        return "projects/cms_app/index";
    }

}
