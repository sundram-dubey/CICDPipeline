package com.hcl.hystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard 
public class MicroservieHystrixDashboardProj03Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservieHystrixDashboardProj03Application.class, args);
	}

}
