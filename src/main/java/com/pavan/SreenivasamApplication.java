package com.pavan;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SreenivasamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SreenivasamApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new org.modelmapper.ModelMapper();
	}
}
