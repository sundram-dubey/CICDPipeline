package com.hcl.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservieCGiServerProj03Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservieCGiServerProj03Application.class, args);
	}

}
