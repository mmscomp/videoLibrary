package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.ComputerScienceDao;
import com.manoj.model.ComputerScience;
import com.manoj.model.Review;

@Service
public class ComputerScienceService  {
	@Autowired
	private ComputerScienceDao computerScienceDao;

	public void setComputerScienceDao(ComputerScienceDao compDao) {
		this.computerScienceDao = compDao;
	}

//	@Override
	@Transactional
	public void addCompEdu(ComputerScience m) {
		this.computerScienceDao.addCompEdu(m);
	}

	//@Override
	@Transactional
	public void updateLogin(ComputerScience m) {
		this.computerScienceDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<ComputerScience> listCompEdu() {
		System.out.println("1. ");
		return this.computerScienceDao.compEduList();
	}

	//@Override
   @Transactional
   public void reviewCompEdu(Review r){
       this.computerScienceDao.reviewCompEdu(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, String title, int mId){
	   return this.computerScienceDao.listReview(genre,title,mId);
   }
	//@Override
	@Transactional
	public void removeCompEdu(int id) {
		this.computerScienceDao.removeCompEdu(id);
	}
	@Transactional
	public void removeCompEduReview(int id) {
		this.computerScienceDao.removeCompEduReview(id);
	}

}