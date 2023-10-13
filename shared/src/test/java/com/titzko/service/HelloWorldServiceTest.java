package com.titzko.service;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService service;

    @Test
    void sayHello() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    void getHelloWorldMsg() {
        String result = service.getHelloWorldMsg();
        assertThat(result).isEqualTo("hello, lets share");
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}