package com.sowrov.micorRest1.controllers;

import com.sowrov.micorRest1.SingletonTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Greetings {
    @RequestMapping("/hello")
    String hello(){
        System.out.println("Should be before instance");
        SingletonTest myst = SingletonTest.getInstance();

        return "Hello User";
    }
}
