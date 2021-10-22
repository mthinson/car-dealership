package com.claim.cardealership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.claim")
public class CarDealershipApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder 
		configure(SpringApplicationBuilder application) {
		return application.sources(CarDealershipApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarDealershipApplication.class, args);
	}

}
