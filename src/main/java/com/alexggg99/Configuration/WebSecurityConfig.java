package com.alexggg99.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;


/**
 * Created by Alex on 18.11.2015.
 */

@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/webjars/**").permitAll();
        http.authorizeRequests().antMatchers("/js/**").permitAll();
        http.authorizeRequests().antMatchers("/css/**").permitAll();
        http.authorizeRequests().antMatchers("/img/**").permitAll();

        http.authorizeRequests().antMatchers("/social_net_app/**").permitAll();
        http.authorizeRequests().antMatchers("/app_resume/**").permitAll();
        http.authorizeRequests().antMatchers("/agency_app/**").permitAll();
        http.authorizeRequests().antMatchers("/photo_gallery_app/**").permitAll();
        http.authorizeRequests().antMatchers("/app_sales/**").permitAll();
        http
                .authorizeRequests()
                .antMatchers("/","/public/**", "/resources/**","/resources/public/**")
                .permitAll()
                .antMatchers("/*").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/cms_app/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("123").roles("USER");
//    }
}
