package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.DramaDao;
import com.manoj.model.Drama;
import com.manoj.model.Review;

@Service
public class DramaService  {
	@Autowired
	private DramaDao dramaDao;

	public void setDramaDao(DramaDao dramaDao) {
		this.dramaDao = dramaDao;
	}

//	@Override
	@Transactional
	public void addDramaMovie(Drama m) {
		this.dramaDao.addDramaMovie(m);
	}

	//@Override
	@Transactional
	public void updateLogin(Drama m) {
		this.dramaDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<Drama> listDramaMovie() {
		System.out.println("1. ");
		return this.dramaDao.dramaMovieList();
	}

	//@Override
/*	@Transactional
	public Login displayLogin(int id) {
		return this.personDao.displayPerson(id);
	}*/
   @Transactional
   public void reviewDramaMovie(Review r){
       this.dramaDao.reviewDramaMovie(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, String title, int mId){
	   return this.dramaDao.listReview(genre,title,mId);
   }
	//@Override
	@Transactional
	public void removeDramaMovie(int id) {
		this.dramaDao.removeDramaMovie(id);
	}
	@Transactional
	public void removeDramaMovieReview(int id) {
		this.dramaDao.removeDramaMovieReview(id);
	}

}