package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;

import com.manoj.dao.DiaryDao;
import com.manoj.model.Diary;

import com.manoj.model.Diary;

@Service
public class DiaryService {

	   private DiaryDao diaryDao;
	   public void setDiaryDao(DiaryDao diaryDao){
		   this.diaryDao = diaryDao;
	   }
	   
	public void addDiary(Diary d){
		this.diaryDao.addDiary(d);
		
	}
	
	public void updateDiary(Diary d){
		this.diaryDao.updateDiary(d);
	}
	
	public Diary displayDiary(int id){
		return this.diaryDao.displayDiary(id);
	}
	
	public void removeDiary(int id){
		this.diaryDao.removeDiary(id);
	}
	
	List<Diary> listDiary(){
		return this.diaryDao.listDiary();
	}

	List<Diary> listDiary1(int id){
		
		return this.diaryDao.listDiary1(id);
	}

}
