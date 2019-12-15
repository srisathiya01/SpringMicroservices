package com.sathiya.movieservice.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/moviedetails1")
	public Movie movie(@RequestParam("name")String movieName) {
		
		MovieDetails movieDetails=restTemplate.getForObject("http://movie-details-service/moviedetails?name="+movieName,MovieDetails.class);
		List<MovieFeedback> lstMovieFeedback=(List<MovieFeedback>)restTemplate.getForObject("http://movie-feedback-service/moviefeedback?name="+movieName, List.class);
		
		Movie movie=new Movie(movieDetails, lstMovieFeedback);
		return movie;
		
	}
	
}
