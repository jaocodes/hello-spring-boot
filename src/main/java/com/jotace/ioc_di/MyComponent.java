package com.jotace.ioc_di;


import org.springframework.stereotype.Service;

@Service
public class MyComponent {


    public String callMyComponent(){
        return "Retornando do meu componente";
    }
}
