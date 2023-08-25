package com.example.oauthclientdemo.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Welcome {

    @GetMapping("/")
    public String main(OAuth2AuthenticationToken token){
        System.out.println(token.getPrincipal());
        
        return "index.html";
    }
}
