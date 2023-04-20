package com.hcl.json.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

	/*
	 * public Student(String name, long phone, String address, int studentId) {
	 * this.name = name; this.phone = phone; this.address = address; this.studentId
	 * = studentId; }
	 */
	private String name;
	private long phone;
	private String address;
	private long  studentId;
}
