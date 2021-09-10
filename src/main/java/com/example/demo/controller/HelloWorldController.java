package com.example.demo.controller;

import com.example.demo.rabbitmq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Producer producer;

    //@Value("${content}")
    //private String content;
	
	@ApiOperation(value = "desc of method", notes = "")
    @RequestMapping("/hello")
    public String index() {
		return "Hello !";
    }

    @RequestMapping("/send")
    public String sendMQ() {
	    producer.send();
        return "success";
    }
}
