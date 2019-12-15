package com.sathiya.moviefeedbackservice.feedback;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedBackController {

	static ArrayList<MovieFeedback> lstMovieFeedback=new ArrayList<MovieFeedback>() {
		{
		add(new MovieFeedback("movie1","5","sathiya"));
		add(new MovieFeedback("movie1","4","sathiya"));
		add(new MovieFeedback("movie1","3","sabari"));
		add(new MovieFeedback("movie2","2","sabari"));
		add(new MovieFeedback("movie2","5","inba"));
		}
	};
	/**
	 * to get movie feedback
	 */
	@RequestMapping("/moviefeedback")
	public List<MovieFeedback> movieFeedBack(@RequestParam("name")String movieName) {
		List<MovieFeedback> movieFeedBack=(List<MovieFeedback>) lstMovieFeedback.stream().filter(p->p.getMovieName().equalsIgnoreCase(movieName)).collect(Collectors.toList());
		return movieFeedBack;
		
	}
	
}
