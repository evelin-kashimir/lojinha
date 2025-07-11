package com.loja.e_commerce.external.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class HelloWordController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }
}
