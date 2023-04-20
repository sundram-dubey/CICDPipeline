package com.hcl.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "book_Id")
	private int id;
	
	private String title;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
}
