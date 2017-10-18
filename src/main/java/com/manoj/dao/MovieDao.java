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

import com.manoj.service.MovieService;

@Repository
public class MovieDao {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieDao.class);
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

//	@Override
	public void addLogin(Movie m) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("8. "+m.getGenre());
		session.persist(m);
		logger.info("Person saved successfully, Person Details="+m);
	}

//	@Override
	public void updateLogin(Movie m){
	Session session = this.sessionFactory.getCurrentSession();
		session.update(m);
		logger.info("Login updated successfully, Login Details="+m);
	}

	@SuppressWarnings("unchecked")
//	@Override
	public List<Movie> movieList() {
		System.out.println("2. ");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("3. ");
		List<Movie> movieList = session.createQuery("from Movie").list();
		System.out.println(movieList);
		for(Movie m : movieList){
			logger.info("Movie List::"+m);
		}
		return movieList;
	}

//	@Override
/*	public Person displayPerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Person p = (Person) session.load(Person.class, new Integer(id));
		logger.info("Diary loaded successfully, diary details="+p);
		return p;
	}
*/
//	@Override
	public void removeMovie(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Movie l = (Movie) session.load(Movie.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Diary deleted successfully, diary details="+l);
	}

} 