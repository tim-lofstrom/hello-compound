package com.tim.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index(){
        System.out.println("This is amazing!");
        return "Hello From Hello-Spring!";
    }
}
