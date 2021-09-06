package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "desc of class")
@RestController
public class HelloWorldController {
	
	
	@Value("${content}")
    private String content; 
	
	@ApiOperation(value = "desc of method", notes = "")
    @RequestMapping("/hello")
    public String index(@ApiParam(value = "desc of param" , required=true ) @RequestParam String name) {
		return "Hello " + name + "!";
    }
}
