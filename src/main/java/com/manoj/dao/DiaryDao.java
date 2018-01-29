package com.manoj.dao;
import com.manoj.dao.*;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.manoj.model.*;
import com.manoj.service.DiaryService;

public class DiaryDao {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaryDao.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

//	@Override
	public void addDiary(Diary p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Diary saved successfully, Diary Details="+p);
	}

//	@Override
	public void updateDiary(Diary p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Diary updated successfully, Diary Details="+p);
	}

	@SuppressWarnings("unchecked")
//	@Override
	public List<Diary> listDiary() {
		System.out.println("2. ");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("3. ");
		List<Diary> diaryList = session.createQuery("from Diary").list();
		System.out.println(diaryList);
		for(Diary p : diaryList){
			logger.info("Diary List::"+p);
		}
		return diaryList;
	}

//	@Override
	public Diary displayDiary(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Diary p = (Diary) session.load(Diary.class, new Integer(id));
		logger.info("Diary loaded successfully, diary details="+p);
		return p;
	}
	
	@SuppressWarnings("unchecked")
	public List<Diary> listDiary1(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Diary> diaryList = session.createQuery("from Diary where person_id='"+id+"'").list();
		for(Diary d : diaryList){
			d.setPerson_id(id);
			logger.info("Diary List::"+d);
		}
		return diaryList;
	}
	

//	@Override
	public void removeDiary(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Diary p = (Diary) session.load(Diary.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Diary deleted successfully, diary details="+p);
	}


}
