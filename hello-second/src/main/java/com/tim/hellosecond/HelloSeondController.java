package com.tim.hellosecond;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSeondController {
    
    int i = 0;

    @RequestMapping("/")
    public String index(){
        return "Hello from Hello-Second" + i++;
    }

}
