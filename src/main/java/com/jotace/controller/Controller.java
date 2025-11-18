package com.jotace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstController")
public class Controller {
    @GetMapping("/firstEndpoint/{id}")
    public String firstEndpoint(@PathVariable String id){
        return  "O parâmetro é: " + id;
    }
}
