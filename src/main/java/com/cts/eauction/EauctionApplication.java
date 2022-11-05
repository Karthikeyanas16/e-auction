package com.cts.eauction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cts.eauction.repository.ProductRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
public class EauctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EauctionApplication.class, args);
	}

}
