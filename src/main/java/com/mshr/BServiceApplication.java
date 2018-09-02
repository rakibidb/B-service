package com.mshr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BServiceApplication {

	@Autowired
	private PersonRepo personRepo;

	public static void main(String[] args) {
		SpringApplication.run(BServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner cmd() {
		return args -> {
			personRepo.save(new Person(1, "Rakib", 20L));
			personRepo.save(new Person(2, "Sakib", 20L));
			personRepo.save(new Person(3, "Nokib", 20L));
			personRepo.save(new Person(4, "Akib", 20L));
			personRepo.save(new Person(5, "NAfi", 20L));

		};
	}
}
