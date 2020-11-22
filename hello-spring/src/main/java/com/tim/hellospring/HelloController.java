package com.tim.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private CustomerRepository repository;

    private int counter = 0;
    
    @RequestMapping("/")
    public String index(){
        System.out.println("This is amazing!");

        Customer customer = new Customer("Tim", "Lofstrom " + counter++);
        repository.save(customer);

        return "Added new customer Tim Lofstrom " + counter;
    }
}
