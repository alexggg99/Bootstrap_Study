package com.alexggg99.config;

/**
 * Created by alexggg99 on 23.12.15.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/user/**").hasRole("USER");
        http
                .csrf().disable() // DISABLED CSRF protection to make it easier !
                .authorizeRequests()
                .antMatchers("/", "/product", "/auth/**").permitAll();
    }


//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(userDetailsService);
//        auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");
//    }

}