package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		int i=1;
        System.out.println("Hello" +i);
		i++;
		System.out.println("Hello" +i);
		i++;
		System.out.println("Hello" +i);
		i++;
		System.out.println("Hello" +i);


	}

}
