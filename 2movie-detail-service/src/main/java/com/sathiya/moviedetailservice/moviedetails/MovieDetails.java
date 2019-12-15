package com.sathiya.moviedetailservice.moviedetails;

public class MovieDetails {
	private String movieName;
	private String movieDescription;
	private String director;
	private String actor;
	private String actress;
	public MovieDetails() {
		super();
	}
	public MovieDetails(String movieName, String movieDescription, String director, String actor, String actress) {
		super();
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	

}
