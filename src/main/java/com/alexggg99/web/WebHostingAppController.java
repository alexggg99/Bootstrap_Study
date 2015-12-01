package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("web_hosting_app")
public class WebHostingAppController {

    @RequestMapping(value = "/index")
    public String home(){
        return "projects/web_hosting_app/index";
    }

    @RequestMapping(value = "/domain")
    public String domain(){
        return "projects/web_hosting_app/domain";
    }

    @RequestMapping(value = "/contact")
    public String contact(){
        return "projects/web_hosting_app/contact";
    }

}
