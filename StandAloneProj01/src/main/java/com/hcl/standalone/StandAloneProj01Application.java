package com.hcl.standalone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;

import com.hcl.check.Animal;
	
@SpringBootApplication
public class StandAloneProj01Application implements CommandLineRunner{

	@Autowired
	@Qualifier("bean2")
	Animal animal;
	public static void main(String[] args) {
		SpringApplication.run(StandAloneProj01Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		    System.out.print(animal.name);
	}

}
