package com.jotace.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/firstController")
public class Controller {
    @GetMapping("/firstEndpoint/{id}")
    public String firstEndpoint(@PathVariable String id){
        return  "O parâmetro é: " + id;
    }
    @GetMapping("/endpointWithQueryParams")
    public String queryParams(@RequestParam String id){
        return "O parâmetro via Query Params é " + id;
    }
    @GetMapping("/endpointWithQueryParamsTwo")
    public String queryParamsTwo(@RequestParam Map<String, String> allParams){
        return "O parâmetro via Query Params é " + allParams.entrySet();
    }
}
