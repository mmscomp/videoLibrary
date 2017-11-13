package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.LiveTVDao;
import com.manoj.model.LiveTV;
import com.manoj.model.Review;

@Service
public class LiveTVService  {
	@Autowired
	private LiveTVDao liveTVDao;

	public void setLiveTVDao(LiveTVDao liveTVDao) {
		this.liveTVDao = liveTVDao;
	}

//	@Override
	@Transactional
	public void addLiveTV(LiveTV m) {
		this.liveTVDao.addLiveTV(m);
	}

	//@Override
	@Transactional
	public void updateLogin(LiveTV m) {
		this.liveTVDao.updateLogin(m);
	}

	//@Override
	@Transactional
	public List<LiveTV> listLiveTV() {
		System.out.println("1. ");
		return this.liveTVDao.liveTVList();
	}

	//@Override
/*	@Transactional
	public Login displayLogin(int id) {
		return this.personDao.displayPerson(id);
	}*/
   @Transactional
   public void reviewLiveTV(Review r){
       this.liveTVDao.reviewLiveTV(r);	   
   }
   @Transactional
   public List<String> listReview(String genre, String title, int mId){
	   return this.liveTVDao.listReview(genre,title,mId);
   }
	//@Override
	@Transactional
	public void removeLiveTV(int id) {
		this.liveTVDao.removeLiveTV(id);
	}
	@Transactional
	public void removeLiveTVReview(int id) {
		this.liveTVDao.removeLiveTVReview(id);
	}

}