package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Value("${welcome}")
    private String message;

    @RequestMapping("/")
    public String doSomething(){
        return message;
    }
}
