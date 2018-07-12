package com.example.springbootenvconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEnvConfigApplication {

	public static void main(String[] args) {
		System.out.println(System.getenv("DEPLOY_ENV"));
		SpringApplication.run(SpringBootEnvConfigApplication.class, args);

	}
}
