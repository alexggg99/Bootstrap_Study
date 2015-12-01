package com.alexggg99.web;

import com.alexggg99.domain.Category;
import com.alexggg99.domain.CategoryRepository;
import com.alexggg99.domain.Page;
import com.alexggg99.domain.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Calendar;
import java.util.List;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping("cms_app")
public class AppCMSController {

    @Autowired
    private PageRepository pageRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/resource")
    public ResponseEntity<List<Page>> resource() {
        List<Page> pageList = (List<Page>) pageRepository.findAll();
        return new ResponseEntity<List<Page>>(pageList, HttpStatus.OK);
    }

    @RequestMapping(value = "/resource/{id}", method = RequestMethod.GET)
    public ResponseEntity<Page> resourceById(@PathVariable("id") long id) {
        Page page = pageRepository.findOne(id);
        return new ResponseEntity<Page>(page, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/getCategories", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getCategories(){
        List<Category> list = (List<Category>) categoryRepository.findAll();
        return new ResponseEntity<List<Category>>(list, HttpStatus.OK);
                
    }

    @RequestMapping(value = "/savePage", method = RequestMethod.POST)
    public ResponseEntity<Page> savePage(@RequestBody Page page) {
        Page output = pageRepository.save(page);
        return new ResponseEntity<Page>(output, HttpStatus.OK);
    }

    @RequestMapping(value = "/main")
    public String index(){
        return "projects/cms_app/main";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "projects/cms_app/login";
    }

    @RequestMapping(value = "/pages")
    public String pages(){
        return "projects/cms_app/pages";
    }

    @RequestMapping(value = "/page")
    public String page(){
        return "projects/cms_app/page";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        System.out.println();
        return user;
    }

    @RequestMapping("/checkSession")
    @ResponseBody
    public String checkSession(){
        return "{\"session\":\"343434\"}";
    }

}
