package com.projekat.porucivanje.proizvoda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootPorucivanjeProizvodaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPorucivanjeProizvodaApplication.class, args);
	}

	@Bean
	@LoadBalanced

	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
