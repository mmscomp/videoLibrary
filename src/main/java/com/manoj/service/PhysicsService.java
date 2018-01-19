package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.PhysicsDao;
import com.manoj.model.Physics;
import com.manoj.model.Review;

@Service
public class PhysicsService  {
	@Autowired
	private PhysicsDao physicsDao;

	public void setPhysicsDao(PhysicsDao physicsDao) {
		this.physicsDao = physicsDao;
	}

//	@Override
	@Transactional
	public void addPhyEdu(Physics m) {
		this.physicsDao.addPhyEdu(m);
	}

	//@Override
	@Transactional
	public void updateLogin(Physics m) {
		this.physicsDao.updateLogin(m);
	}
    
	@Transactional
	public List<String> phyEdu(int id){
		return this.physicsDao.phyEdu(id);
	}
	//@Override
	@Transactional
	public List<Physics> listPhyEdu() {
		System.out.println("1. ");
		return this.physicsDao.phyEduList();
	}

	//@Override
   @Transactional
   public void reviewPhyEdu(Review r){
       this.physicsDao.reviewPhyEdu(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, String title, int mId){
	   return this.physicsDao.listReview(genre,title,mId);
   }
	//@Override
	@Transactional
	public void removePhyEdu(int id) {
		this.physicsDao.removePhyEdu(id);
	}
	@Transactional
	public void removePhyEduReview(int id) {
		this.physicsDao.removePhyEduReview(id);
	}

}