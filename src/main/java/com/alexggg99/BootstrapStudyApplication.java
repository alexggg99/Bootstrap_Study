package com.alexggg99;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BootstrapStudyApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(BootstrapStudyApplication.class).run(args);
    }

}
