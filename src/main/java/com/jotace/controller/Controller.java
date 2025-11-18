package com.jotace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstController")
public class Controller {
    @GetMapping("/firstEndpoint")
    public String firstEndpoint(){
        return  "Minha primeira rota API REST";
    }
}
