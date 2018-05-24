package com.aad.azure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AADAzureController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
