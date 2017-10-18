package com.manoj.model;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="GENRE")
	private String genre;
	
	public Movie(){}
	public Movie (String genre){
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getId() {
		return id;
	}
	
}
