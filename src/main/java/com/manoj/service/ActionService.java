package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.ActionDao;
import com.manoj.model.Action;
import com.manoj.model.Review;

@Service
public class ActionService  {
	@Autowired
	private ActionDao actionDao;

	public void setActionDao(ActionDao actionDao) {
		this.actionDao = actionDao;
	}

//	@Override
	@Transactional
	public void addActionMovie(Action m) {
		this.actionDao.addActionMovie(m);
	}

	//@Override
	@Transactional
	public void updateLogin(Action m) {
		this.actionDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<Action> listActionMovie() {
		System.out.println("1. ");
		return this.actionDao.actionMovieList();
	}

	//@Override
/*	@Transactional
	public Login displayLogin(int id) {
		return this.personDao.displayPerson(id);
	}*/
   @Transactional
   public void reviewActionMovie(Review r){
       this.actionDao.reviewActionMovie(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, int mId){
	   return this.actionDao.listReview(genre,mId);
   }
	//@Override
	@Transactional
	public void removeActionMovie(int id) {
		this.actionDao.removeActionMovie(id);
	}

}