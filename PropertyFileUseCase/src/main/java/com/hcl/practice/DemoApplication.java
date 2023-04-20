package com.hcl.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hcl.practice.framework.Sample01;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext actx = SpringApplication.run(DemoApplication.class, args);
	Sample01 s1 = actx.getBean("SB1", Sample01.class);
	System.out.println(s1.getId());
	System.out.println(s1.getPwd());
	System.out.println(s1);
	}
}
