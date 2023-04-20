package com.hcl.movie.resouces;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.movie.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(String userId){
	return Collections.singletonList(new CatalogItem("End Game", "Test",4));
	
	}
}
