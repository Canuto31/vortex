package com.test.vortex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("say")
public class HelloWorldController {

    @GetMapping("/hi")
    public String sayHello() {
        return "Hello world ";
    }
}
