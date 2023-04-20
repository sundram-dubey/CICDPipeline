package com.hcl.movie.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.movie.model.Movie;

@RestController
@RequestMapping("movie")
public class MovieResource {
    
	@RequestMapping("/{movieId}")
	public Movie getmovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Test name");
	}
}
