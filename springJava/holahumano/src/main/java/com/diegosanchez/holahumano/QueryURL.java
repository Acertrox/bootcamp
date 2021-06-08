package com.diegosanchez.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryURL {
    @RequestMapping("/")
    public String query(@RequestParam(value="name", required = false) String searchQuery){
        if (searchQuery == null){
            return "Hello Human!\n\nWelcome to SpringBoot!";
        }
        else{
            return "Hello "+searchQuery+"!\n\nWelcome to SpringBoot!";
        }
    }
}
