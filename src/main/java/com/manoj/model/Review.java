package com.manoj.model;

import javax.persistence.*;

@Entity
@Table(name="review")
public class Review {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="review")
	private String review;
	
	@Column(name="movieGenre")
	private String genre;
	
	@Column(name="movieId")
	private int movieId;
    @Column(name="user")
    private String user;
    @Column(name="userLocation")
    private String location;
    
	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
