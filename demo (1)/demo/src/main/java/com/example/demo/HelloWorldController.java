package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping()
    String hello(){
        return "Hello World!";
    }
    @GetMapping("/heloo")
    String hoelsdf(){
        return "Hello World!";
    }
}
