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

import com.manoj.service.HorrorService;
@Repository
public class HorrorDao {
	
	private static final Logger logger = LoggerFactory.getLogger(DramaDao.class);
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

//	@Override
	public void addHorrorMovie(Horror m) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("8. "+m.getTitle());
		session.persist(m);
		logger.info("Horror movie saved successfully, Movie Details="+m);
	}

//	@Override
	public void updateLogin(Horror m){
	Session session = this.sessionFactory.getCurrentSession();
		session.update(m);
		logger.info("Login updated successfully, Login Details="+m);
	}

	@SuppressWarnings("unchecked")
//	@Override
	public List<Horror> horrorMovieList() {
		System.out.println("2. ");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("3. ");
		List<Horror> horrorList = session.createQuery("from Horror").list();
		System.out.println(horrorList);
		for(Horror m : horrorList){
			logger.info("Movie List::"+m);
		}
		return horrorList;
	}

//	@Override
/*	public Person displayPerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Person p = (Person) session.load(Person.class, new Integer(id));
		logger.info("Diary loaded successfully, diary details="+p);
		return p;
	}
*/
	public void reviewHorrorMovie(Review r){
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
	public void removeHorrorMovie(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Horror l = (Horror) session.load(Horror.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Horror movie deleted successfully, movie details="+l);
	}
	public void removeHorrorMovieReview(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Review l = (Review) session.load(Review.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Review deleted successfully, review details="+l);
	}

} 