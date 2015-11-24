package com.alexggg99;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@SpringBootApplication
public class BootstrapStudyApplication {

    @Configuration
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected static class MySecurityConfigurer extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .antMatchers("/", "/webjars/**", "/js/**",
                            "/photo_gallery_app/**", "/app_sales/**", "/css/**", "/img/**").permitAll()
                    .antMatchers("/social_net_app/**", "/app_resume/**", "/agency_app/**").permitAll()
                    .antMatchers("/photo_gallery_app/**", "/app_sales/**", "/css/**", "/img/**", "/cms_app/user").permitAll()
                    .anyRequest().fullyAuthenticated()
//                    .and()
//                    .formLogin()
//                    .loginPage("/cms_app/login")
//                    .permitAll()
                    .and()
                    .logout()
                    .logoutSuccessUrl("/cms_app/login")
                    .permitAll()
                    .and()
                    .httpBasic();
//                    .and()
//                    .and()
//                    .logout()
//                    .permitAll();
        }

        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth
                    .inMemoryAuthentication()
                    .withUser("user").password("123").roles("USER");
        }

    }


    public static void main(String[] args) {
        SpringApplication.run(BootstrapStudyApplication.class, args);
    }
}
