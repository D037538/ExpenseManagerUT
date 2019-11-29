package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication


public class EasyNotesApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}
}