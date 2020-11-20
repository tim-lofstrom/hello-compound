package com.tim.hellosecond;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSeondController {
    
    @RequestMapping("/")
    public String index(){
        return "Hello from Hello-Second (Updated)";
    }

}
