package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @RequestMapping("/view")
    public String profile() {
        return "views/profile";
    }

}
