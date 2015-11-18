package com.alexggg99.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("photo_gallery_app")
public class AppPhotoGalleryController {

    @RequestMapping(value = "/index")
    public String home(){
        return "projects/photo_gallery_app/index";
    }

}
