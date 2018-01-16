package com.manoj.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.manoj.model.*;
import org.springframework.transaction.annotation.Transactional;

import com.manoj.service.EducationService;

@Repository
public class EducationDao {
	
	private static final Logger logger = LoggerFactory.getLogger(EducationDao.class);
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

//	@Override
	public void addLogin(Education e) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("8. "+e.getField());
		session.persist(e);
		logger.info("Person saved successfully, Person Details="+e);
	}

//	@Override
	public void updateLogin(Education e){
	Session session = this.sessionFactory.getCurrentSession();
		session.update(e);
		logger.info("Login updated successfully, Login Details="+e);
	}

	@SuppressWarnings("unchecked")
//	@Override
	public List<Education> eduList() {
		System.out.println("2. ");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("3. ");
		List<Education> eduList = session.createQuery("from Education").list();
		System.out.println(eduList);
		for(Education e : eduList){
			logger.info("Education List::"+e);
		}
		return eduList;
	}

//	@Override
	public void removeEdu(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Education l = (Education) session.load(Education.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Edu category deleted successfully, diary details="+l);
	}

} 