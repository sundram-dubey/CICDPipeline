package com.hcl.practice.framework;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {

	private String doorNo;
	private String street;
	private String locality;
	
}
