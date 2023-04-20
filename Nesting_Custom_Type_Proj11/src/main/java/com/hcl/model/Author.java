package com.hcl.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Embeddable
public class Author {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO )
	private int authorId;
	private String firstName;
	private String lastName;
	private String language;
}
