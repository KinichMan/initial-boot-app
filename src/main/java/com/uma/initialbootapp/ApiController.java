package com.uma.initialbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController{
    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello from API";
    }
}