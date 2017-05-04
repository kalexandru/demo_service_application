package com.example.controller;

import com.example.model.Greet;
import com.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oleksandr.kushnir on 01.05.2017.
 */

@RestController
public class GreetingController {

    @Autowired
    private GreetingService helloService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Greet showGreeting(){
        return helloService.getGreetings();
    }
}
