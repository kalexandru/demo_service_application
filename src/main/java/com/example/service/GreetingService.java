package com.example.service;

import com.example.model.Greet;
import org.springframework.stereotype.Service;

/**
 * Created by oleksandr.kushnir on 01.05.2017.
 */
@Service
public class GreetingService {


    public Greet getGreetings(){
        return new Greet("Greetings stranger !!!");
    }
}
