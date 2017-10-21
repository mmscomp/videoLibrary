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

import com.manoj.service.ActionService;
@Repository
public class ActionDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ActionDao.class);
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

//	@Override
	public void addActionMovie(Action m) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("8. "+m.getTitle());
		session.persist(m);
		logger.info("Person saved successfully, Person Details="+m);
	}

//	@Override
	public void updateLogin(Action m){
	Session session = this.sessionFactory.getCurrentSession();
		session.update(m);
		logger.info("Login updated successfully, Login Details="+m);
	}

	@SuppressWarnings("unchecked")
//	@Override
	public List<Action> actionMovieList() {
		System.out.println("2. ");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("3. ");
		List<Action> actionList = session.createQuery("from Action").list();
		System.out.println(actionList);
		for(Action m : actionList){
			logger.info("Movie List::"+m);
		}
		return actionList;
	}

//	@Override
/*	public Person displayPerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Person p = (Person) session.load(Person.class, new Integer(id));
		logger.info("Diary loaded successfully, diary details="+p);
		return p;
	}
*/
	public void reviewActionMovie(Review r){
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
	public void removeActionMovie(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Action l = (Action) session.load(Action.class, new Integer(id));
		if(null != l){
			session.delete(l);
		}
		logger.info("Diary deleted successfully, diary details="+l);
	}

} 