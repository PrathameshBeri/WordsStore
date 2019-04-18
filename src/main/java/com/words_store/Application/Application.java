package com.words_store.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.words_store"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.words_store"})
@EntityScan(basePackages = {"com.words_store"})
@ComponentScan(basePackages = {"com.words_store"})
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SpringApplication.run(Application.class, args);
	}

}
