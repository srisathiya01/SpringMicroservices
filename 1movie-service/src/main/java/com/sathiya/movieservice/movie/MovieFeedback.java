package com.sathiya.movieservice.movie;

public class MovieFeedback {

	private String movieName;
	private String rating;
	private String feedBackGivenBy;
	
	public MovieFeedback() {
		super();
	}
	
	
	public MovieFeedback(String movieName, String rating,String feedBackGivenBy) {
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.feedBackGivenBy=feedBackGivenBy;
	}


	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getFeedBackGivenBy() {
		return feedBackGivenBy;
	}


	public void setFeedBackGivenBy(String feedBackGivenBy) {
		this.feedBackGivenBy = feedBackGivenBy;
	}
	
	
}
