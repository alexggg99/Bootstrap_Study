package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("app_resume")
public class AppResumeController {

    @RequestMapping(value = "/home")
    public String home(){
        return "projects/portfolio_resume/home";
    }


}
