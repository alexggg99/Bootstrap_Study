package com.alexggg99.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("cms_app")
public class AppCMSController {

    @RequestMapping("/resource")
    @ResponseBody
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @RequestMapping(value = "/main")
    public String index(){
        return "projects/cms_app/main";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "projects/cms_app/login";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        System.out.println();
        return user;
    }

}
