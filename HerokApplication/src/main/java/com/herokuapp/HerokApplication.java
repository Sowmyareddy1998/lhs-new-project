package com.herokuapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HerokApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokApplication.class, args);
		System.out.println("hello java");
	}

}
