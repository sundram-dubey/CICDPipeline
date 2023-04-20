package com.hcl.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatalogItem {

	private String name;
	private String desc;
	private int rating;
}
