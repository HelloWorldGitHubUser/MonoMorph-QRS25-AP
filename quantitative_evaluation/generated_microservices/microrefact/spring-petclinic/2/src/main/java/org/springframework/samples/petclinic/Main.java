package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.samples.petclinic.Interface.OwnerRepository;
import org.springframework.samples.petclinic.Interface.OwnerRepositoryImpl;

@SpringBootApplication
public class Main {

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();

	}

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);

	}

	@Bean
	public OwnerRepository ownerrepository() {

		return new OwnerRepositoryImpl();
	}

}