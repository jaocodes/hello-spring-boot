package com.jotace.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    record User(String username){};

    @PostMapping("/postEndpoint")
    public String postEndpoint(@RequestBody User user){
        return "postEndpoint recebeu " + user.username();
    }

    @PostMapping("/postEndpointWithHeader")
    public String postEndpointWithHeader(@RequestHeader("name") String name){
        return "postEndpointWithHeader recebeu " + name;
    }

    @PostMapping("/postEndpointWithHeaders")
    public String postEndpointWithHeaders(@RequestHeader Map<String, String> headers){
        return "postEndpointWithHeaders recebeu " + headers.entrySet();
    }

    @GetMapping("/responseEntity/{id}")
    public ResponseEntity<Object> responseEntity(@PathVariable int id){
        User user = new User("Jotace");
        if(id > 5){
            return ResponseEntity.status(HttpStatus.OK).body(user.username());

        }

        return ResponseEntity.badRequest().body("Número menor que 5");

    }

}
