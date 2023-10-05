package com.rebolledoroberto.Practise02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "Repository")
public class Practise02Application {

	public static void main(String[] args) {
		SpringApplication.run(Practise02Application.class, args);
	}

}
