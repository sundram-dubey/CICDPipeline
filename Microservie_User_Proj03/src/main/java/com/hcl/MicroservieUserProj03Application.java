package com.hcl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroservieUserProj03Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservieUserProj03Application.class, args);
	}
    
	@Bean
	@Lazy
	@Qualifier("restTemplate")
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
