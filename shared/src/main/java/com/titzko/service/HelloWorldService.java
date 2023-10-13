package com.titzko.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private final String HELLO_WORLD_MESSAGE = "hello, lets share";

    public void sayHello() {
        System.out.println(HELLO_WORLD_MESSAGE);
    }

    public String getHelloWorldMsg() {
        return HELLO_WORLD_MESSAGE;
    }
}
