package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.EducationDao;
import com.manoj.model.Education;

@Service
public class EducationService  {
	@Autowired
	private EducationDao educationDao;

	public void setEducationDao(EducationDao eduDao) {
		this.educationDao = eduDao;
	}

//	@Override
	@Transactional
	public void addEducation(Education e) {
		this.educationDao.addEdu(e);
	}

	//@Override
	@Transactional
	public void updateLogin(Education e) {
		this.educationDao.updateLogin(e);
	}

	//@Override
	@Transactional
	public List<Education> listEducation() {
		System.out.println("1. ");
		return this.educationDao.eduList();
	}

	//@Override
/*	@Transactional
	public Login displayLogin(int id) {
		return this.personDao.displayPerson(id);
	}*/

	//@Override
	@Transactional
	public void removeEdu(int id) {
		this.educationDao.removeEdu(id);
	}

}