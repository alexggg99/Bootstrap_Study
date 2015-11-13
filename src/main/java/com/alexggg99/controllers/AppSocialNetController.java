package com.alexggg99.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("social_net_app")
public class AppSocialNetController {

    @RequestMapping(value = "/index")
    public String home(){
        return "projects/social_net_app/index";
    }


}
