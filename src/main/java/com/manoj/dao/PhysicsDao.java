package com.manoj.dao;

import com.manoj.model.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.manoj.model.*;
import org.springframework.transaction.annotation.Transactional;

import com.manoj.service.PhysicsService;
@Repository
public class PhysicsDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ActionDao.class);
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

//	@Override
	public void addPhyEdu(Physics m) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("8. "+m.getTitle());
		session.persist(m);
		logger.info("Phy vdo saved successfully, Person Details="+m);
	}

//	@Override
	public void updateLogin(Physics m){
	Session session = this.sessionFactory.getCurrentSession();
		session.update(m);
		logger.info("Login updated successfully, Login Details="+m);
	}

	@SuppressWarnings("unchecked")
//	@Override
	public List<Physics> phyEduList() {
		System.out.println("2. ");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("3. ");
		List<Physics> phyList = session.createQuery("from Physics").list();
		System.out.println(phyList);
		for(Physics m : phyList){
			logger.info("Phy cate List::"+m);
		}
		return phyList;
	}

//	@Override
	public void reviewPhyEdu(Review r){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(r);
	}
	@SuppressWarnings("unchecked")
	public List<String> listReview(String gen, String title, int mId){
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Review r where r.genre = ? and r.title = ? and r.movieId=?";
		List<String> listReview = session.createQuery(hql).setParameter(0,gen).setParameter(1,title).setString(2, String.valueOf(mId)).list();
	    return listReview;
	}
//	@Override
	public void removePhyEdu(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Physics l = (Physics) session.load(Physics.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Physics edu category deleted successfully, movie details="+l);
	}
	public void removePhyEduReview(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Review l = (Review) session.load(Review.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Review deleted successfully, review details="+l);
	}

} 