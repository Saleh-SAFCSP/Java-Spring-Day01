package com.example.test123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDay01 {

	public static void main(String[] args) {
		SpringApplication.run(SpringDay01.class, args);
	}

	@Bean
	public static void test(){
		System.out.println("Hey from test");
	}

}


