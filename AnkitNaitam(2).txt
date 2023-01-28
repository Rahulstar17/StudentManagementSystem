package com.BikkadIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionApplication.class, args);

		Addition add = new Addition();
		int sum = add.sum(10, 10);
		System.out.println("Addition of two numbers :" + sum);

	}

}
