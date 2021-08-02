package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@Value("${content}")
    private String content; 
	
    @RequestMapping("/hello")
    public String index() {
        return content;
    }
}
