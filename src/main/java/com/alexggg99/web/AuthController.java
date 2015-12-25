package com.alexggg99.web;

import com.alexggg99.config.CustomUserDetailsService;
import com.alexggg99.domain.Repo.RoleRepository;
import com.alexggg99.domain.Repo.UserRepository;
import com.alexggg99.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by alexggg99 on 25.12.15.
 */

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    @ResponseBody
    public String checkUser(){
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            return "{\"error\": false}";
        }
        System.out.println("test" + auth.getName());
        return "{\"error\": true}";
    }

    @ResponseBody
    @RequestMapping(value="/login.json", method = RequestMethod.POST)
    public String mosLogin(@RequestBody String loginRequest, HttpServletRequest request) {
        String response = null;
        String username = "";
        String password = "";

        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(loginRequest.toString());
            JSONObject jsonObject = (JSONObject) obj;
            username = (String) jsonObject.get("login");
            password = (String) jsonObject.get("password");
        }catch(ParseException pe){
            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        }

        User user = userRepository.findByUsername(username);
        if(user == null){
            return "{\"error\": true}";
        }
        if(user != null){

            if(!user.getPassword().equals(password)){
                return "{\"error\": true}";
            }

            authUser(user);

        }
        return "{\"error\": false}";
    }

    @ResponseBody
    @RequestMapping(value="/logout.json", method = RequestMethod.GET)
    public String mosLogout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
            return "{\"error\": false}";
        }else{
            return "{\"error\": true}";
        }
    }

    private void authUser(User user){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        final Authentication authentication2 = authentication;

        final CustomUserDetailsService userDetailsService = new CustomUserDetailsService();

        final org.springframework.security.core.userdetails.UserDetails u = userDetailsService.getUser(user);
        final String un = user.getUsername();
        Authentication trustedAuthentication = new Authentication () {
            private String name = un;
            private Object details = authentication2.getDetails();

            private UserDetails user = u;
            private boolean authenticated = true;
            private Collection<? extends GrantedAuthority> authorities = u.getAuthorities();

            @ Override
            public String getName() {
                return name;
            }
            @ Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return authorities;
            }
            @ Override
            public Object getCredentials() {
                return user.getPassword();
            }
            @ Override
            public Object getDetails() {
                return details;
            }
            @ Override
            public Object getPrincipal() {
                return user;
            }
            @ Override
            public boolean isAuthenticated() {
                return authenticated;
            }
            @ Override
            public void setAuthenticated(boolean authenticated) throws IllegalArgumentException {
                this.authenticated = authenticated;
            }

        };
        authentication = trustedAuthentication;
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

}
