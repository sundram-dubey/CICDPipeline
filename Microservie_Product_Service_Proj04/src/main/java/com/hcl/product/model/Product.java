package com.hcl.product.model;

import java.math.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Table(name = "Product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private double price;
}
