package com.cognizant.server.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/data")
    public String getData() {
        return "This is my data";
    }
}
