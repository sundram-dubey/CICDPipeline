package com.hcl.standalone;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.hcl.check.Animal;

@Configuration
@ComponentScan(basePackages = "com.hcl.check")
public class MyConfig {
   
	@Bean
	@Lazy
	public Animal getAnimal() {
		System.out.println("MyConfig.getAnimal()");
		return new Animal();
	}
	@Bean("bean2")
	public Animal getAnimals() {
		System.out.println("MyConfig.getAnimals()");
		return new Animal();
	}
}
