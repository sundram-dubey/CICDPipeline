package com.hcl.json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.hcl.json.entity.Student;

@SpringBootApplication
public class JsonProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(JsonProj01Application.class, args);
	Student st1 = new Student("Sundram Dubey", 7054702937l,"Kasia-Kushinagar", 101);
	
	Gson gson = new Gson();
	String studentStr = gson.toJson(st1);
	System.out.println(studentStr);
;	}

}
