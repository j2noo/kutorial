package com.backend.kutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/kutorial")
    public String kutorial() {
        System.out.println("@");

        return "health test!";
    }
}
