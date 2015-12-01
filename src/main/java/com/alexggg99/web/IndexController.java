package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/menu")
    public String replay(){
        return "menu";
    }

    @RequestMapping(value = "/typography")
    public String typography() {
        return "typography";
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public String json(){
        return "{\"id\":1,\"content\":\"Hello, World!\"}";
    }



}
