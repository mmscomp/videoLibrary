package com.manoj.controller;

import com.manoj.model.Movie;
import com.manoj.service.MovieService;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.manoj.dao.*;
import com.manoj.service.*;
@Controller
public class MovieController {
	private MovieService movieService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="movieService")
	public void setMovieService(MovieService ms){
		this.movieService = ms;
	}
	@RequestMapping(value={"/","/movie"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im inside  Controller");
		
		model.addAttribute("movie",this.movieService.listMovie());
		System.out.println("1");
		return "movie";
	}
	@RequestMapping(value="/movie/add", method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("genre","");
		return "add";		
	}
}
