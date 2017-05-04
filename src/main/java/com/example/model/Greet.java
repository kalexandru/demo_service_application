package com.example.model;

/**
 * Created by oleksandr.kushnir on 01.05.2017.
 */
public class Greet {
    private String message;
    public Greet() {}

    public Greet(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
