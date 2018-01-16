package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.MovieDao;
import com.manoj.model.Movie;

@Service
public class MovieService  {
	@Autowired
	private MovieDao movieDao;

	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

//	@Override
	@Transactional
	public void addLogin(Movie m) {
		this.movieDao.addLogin(m);
	}

	//@Override
	@Transactional
	public void updateLogin(Movie m) {
		this.movieDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<Movie> listMovie() {
		System.out.println("1. ");
		return this.movieDao.movieList();
	}

	@Transactional
	public void removeMovie(int id) {
		this.movieDao.removeMovie(id);
	}

}