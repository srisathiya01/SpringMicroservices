package com.sathiya.moviedetailservice.moviedetails;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieDetailsController {

	static ArrayList<MovieDetails> lstMovieDetails=new ArrayList<MovieDetails>() {
		{
			add(new MovieDetails("movie1", "movieDescription1", "director1", "actor1", "actress1"));
			add(new MovieDetails("movie2", "movieDescription2", "director2", "actor2", "actress2"));
			add(new MovieDetails("movie3", "movieDescription3", "director3", "actor3", "actress3"));
			add(new MovieDetails("movie4", "movieDescription4", "director4", "actor4", "actress4"));
		}
	};
	@RequestMapping("/moviedetails")
	public MovieDetails movieDetails(@RequestParam("name")String name) {
		MovieDetails movieDetails=lstMovieDetails.stream().filter(p->p.getMovieName().equalsIgnoreCase(name)).findFirst().get();
		return movieDetails;
	}
	
}
