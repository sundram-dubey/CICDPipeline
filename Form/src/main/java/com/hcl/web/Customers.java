package com.hcl.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String cName;
	private String cMail;
}
