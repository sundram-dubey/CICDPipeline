package com.hcl.webapps.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private String secondName;
	private String work;
	private String email;
	private String phone;
	private String image;
	@Column(length = 5000)
	private String description;
	
	@ManyToOne
	private User user;
}
