package com.example.db.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableAutoConfiguration
@ComponentScan("com.example.*")
@EnableJpaRepositories
@EntityScan("com.example.db.entity")
public class RestDbApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RestDbApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RestDbApplication.class);
	}
	

}
