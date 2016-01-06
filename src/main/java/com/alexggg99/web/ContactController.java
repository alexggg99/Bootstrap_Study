package com.alexggg99.web;

import com.alexggg99.domain.Product;
import com.alexggg99.domain.Question;
import com.alexggg99.domain.Repo.ProductRepository;
import com.alexggg99.domain.Repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
@RequestMapping(value = "/contact")
public class ContactController {

    @Autowired
    private QuestionRepository questionRepository;

    @RequestMapping("/view")
    public String productPage() {
        return "views/contact";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> postMessage(@RequestBody Question question){
        questionRepository.save(question);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
