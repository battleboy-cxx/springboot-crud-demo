package com.dariawan.contactapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test}")
    private String test;

    @GetMapping("/test")
    public String test() {
        return "Hello World!" + test;
    }
}

