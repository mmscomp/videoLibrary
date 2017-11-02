package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.ComedyDao;
import com.manoj.model.Comedy;
import com.manoj.model.Review;

@Service
public class ComedyService  {
	@Autowired
	private ComedyDao comedyDao;

	public void setComedyDao(ComedyDao comedyDao) {
		this.comedyDao = comedyDao;
	}

//	@Override
	@Transactional
	public void addComedyMovie(Comedy m) {
		this.comedyDao.addComedyMovie(m);
	}

	//@Override
	@Transactional
	public void updateLogin(Comedy m) {
		this.comedyDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<Comedy> listComedyMovie() {
		System.out.println("1. ");
		return this.comedyDao.comedyMovieList();
	}

	//@Override
/*	@Transactional
	public Login displayLogin(int id) {
		return this.personDao.displayPerson(id);
	}*/
   @Transactional
   public void reviewComedyMovie(Review r){
       this.comedyDao.reviewComedyMovie(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, String title, int mId){
	   return this.comedyDao.listReview(genre,title,mId);
   }
	//@Override
	@Transactional
	public void removeComedyMovie(int id) {
		this.comedyDao.removeComedyMovie(id);
	}
	@Transactional
	public void removeComedyMovieReview(int id) {
		this.comedyDao.removeComedyMovieReview(id);
	}

}