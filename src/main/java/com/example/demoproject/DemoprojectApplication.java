package com.example.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoprojectApplication extends demo{

	public static void main(String[] args) {
		SpringApplication.run(DemoprojectApplication.class, args);
		demo.func();
	}

}
