package com.sathiya.movieservice.movie;

import java.util.List;

public class Movie {

	private MovieDetails movieDetails;
	private List<MovieFeedback> movieFeedback;
	public Movie() {
		super();
	}
	
	public Movie(MovieDetails movieDetails, List<MovieFeedback> movieFeedback) {
		super();
		this.movieDetails = movieDetails;
		this.movieFeedback = movieFeedback;
	}

	public MovieDetails getMovieDetails() {
		return movieDetails;
	}
	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}
	public List<MovieFeedback> getMovieFeedback() {
		return movieFeedback;
	}
	public void setMovieFeedback(List<MovieFeedback> movieFeedback) {
		this.movieFeedback = movieFeedback;
	}
	
}
