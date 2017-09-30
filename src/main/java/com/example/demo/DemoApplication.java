package com.example.demo;

import com.example.demo.repository.ImplementationRepoNameDoesntMatterEitherUnlikeAddingCustomMethodsToSingleRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

// If you forget this annotation Spring will try to parse the methods in your intermediary interface!
@EnableMongoRepositories(repositoryBaseClass = ImplementationRepoNameDoesntMatterEitherUnlikeAddingCustomMethodsToSingleRepo.class)
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
