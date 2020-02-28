package com.sowrov.micorRest1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Greetings {
    @RequestMapping("/hello")
    String hello(){
        return "Hello User";
    }
}
