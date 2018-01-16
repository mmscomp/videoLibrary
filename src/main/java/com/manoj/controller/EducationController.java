package com.manoj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manoj.service.EducationService;

public class EducationController {
	
	private EducationService educationService;
	
	@Autowired(required=true)
	@Qualifier(value="educationService")
	public void setEducationService(EducationService es){
		this.educationService = es;
	}
	@RequestMapping(value={"/edu","/movie/Education"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im inside  Edu Controller");
		
		model.addAttribute("edu",this.educationService.listEducation());
		System.out.println("1");
		return "education";
	}
	@RequestMapping(value="/movie/Education/add", method=RequestMethod.GET)
	public String add(Model model){
 		model.addAttribute("field","");
		return "add";		
	}

}
