package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.HorrorDao;
import com.manoj.model.Horror;
import com.manoj.model.Review;

@Service
public class HorrorService  {
	@Autowired
	private HorrorDao horrorDao;

	public void setHorrorDao(HorrorDao horrorDao) {
		this.horrorDao = horrorDao;
	}

//	@Override
	@Transactional
	public void addHorrorMovie(Horror m) {
		this.horrorDao.addHorrorMovie(m);
	}

	//@Override
	@Transactional
	public void updateLogin(Horror m) {
		this.horrorDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<Horror> listHorrorMovie() {
		System.out.println("1. ");
		return this.horrorDao.horrorMovieList();
	}

	//@Override
/*	@Transactional
	public Login displayLogin(int id) {
		return this.personDao.displayPerson(id);
	}*/
   @Transactional
   public void reviewHorrorMovie(Review r){
       this.horrorDao.reviewHorrorMovie(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, String title, int mId){
	   return this.horrorDao.listReview(genre,title,mId);
   }
	//@Override
	@Transactional
	public void removeHorrorMovie(int id) {
		this.horrorDao.removeHorrorMovie(id);
	}
	@Transactional
	public void removeHorrorMovieReview(int id) {
		this.horrorDao.removeHorrorMovieReview(id);
	}

}