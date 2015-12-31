package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
public class IndexController {

    @RequestMapping("/*")
    public String index() {
        return "index";
    }

    @RequestMapping("/view")
    public String mainpage() {
        return "views/index";
    }

//    @RequestMapping("/product/**")
//    public String mainpage2() {
//        return "index";
//    }

}
