package com.cts.eauction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cts.eauction.repository.ProductRepository;


@SpringBootApplication
public class EauctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EauctionApplication.class, args);
	}

}
