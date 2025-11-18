package com.jotace.first_project_spring_boot;

import com.jotace.controller.Controller;
import com.jotace.ioc_di.MyComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages =  "com.jotace")
@ComponentScan(basePackageClasses =  Controller.class)
@ComponentScan(basePackageClasses =  MyComponent.class)

public class FirstProjectSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectSpringBootApplication.class, args);
	}

}
