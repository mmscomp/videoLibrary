package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.RomanticDao;
import com.manoj.model.Romantic;
import com.manoj.model.Review;

@Service
public class RomanticService  {
	@Autowired
	private RomanticDao romanticDao;

	public void setRomanticDao(RomanticDao romanticDao) {
		this.romanticDao = romanticDao;
	}

//	@Override
	@Transactional
	public void addRomanticMovie(Romantic m) {
		this.romanticDao.addRomanticMovie(m);
	}

	//@Override
	@Transactional
	public void updateLogin(Romantic m) {
		this.romanticDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<Romantic> listRomanticMovie() {
		System.out.println("1. ");
		return this.romanticDao.romanticMovieList();
	}

	//@Override
/*	@Transactional
	public Login displayLogin(int id) {
		return this.personDao.displayPerson(id);
	}*/
   @Transactional
   public void reviewRomanticMovie(Review r){
       this.romanticDao.reviewRomanticMovie(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, String title, int mId){
	   return this.romanticDao.listReview(genre,title,mId);
   }
	//@Override
	@Transactional
	public void removeRomanticMovie(int id) {
		this.romanticDao.removeRomanticMovie(id);
	}
	@Transactional
	public void removeRomanticMovieReview(int id) {
		this.romanticDao.removeRomanticMovieReview(id);
	}

}