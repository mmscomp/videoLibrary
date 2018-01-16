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

import com.manoj.service.ComputerScienceService;
@Repository
public class ComputerScienceDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ActionDao.class);
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

//	@Override
	public void addCompEdu(ComputerScience m) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("8. "+m.getTitle());
		session.persist(m);
		logger.info("Comp vdo saved successfully, Person Details="+m);
	}

//	@Override
	public void updateLogin(ComputerScience m){
	Session session = this.sessionFactory.getCurrentSession();
		session.update(m);
		logger.info("Login updated successfully, Login Details="+m);
	}

	@SuppressWarnings("unchecked")
//	@Override
	public List<ComputerScience> compEduList() {
		System.out.println("2. ");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("3. ");
		List<ComputerScience> compList = session.createQuery("from ComputerScience").list();
		System.out.println(compList);
		for(ComputerScience m : compList){
			logger.info("Comp cate List::"+m);
		}
		return compList;
	}

//	@Override
	public void reviewCompEdu(Review r){
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
	public void removeCompEdu(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		ComputerScience l = (ComputerScience) session.load(ComputerScience.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Comp edu category deleted successfully, movie details="+l);
	}
	public void removeCompEduReview(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Review l = (Review) session.load(Review.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Review deleted successfully, review details="+l);
	}

} 