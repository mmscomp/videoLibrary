package com.manoj.controller;
//import  com.manoj.LoginController;
//import com.manoj.model.Person;
import com.manoj.model.Action;
import com.manoj.model.Review;
import com.manoj.service.ActionService;

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
public class ActionController {
	private ActionService actionService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="actionService")
	public void setMovieService(ActionService as){
		this.actionService = as;
	}
	@RequestMapping(value={"/movie/Action"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside Action Controller");
		model.addAttribute("act","action");
		model.addAttribute("actionMovie",this.actionService.listActionMovie());
		System.out.println("1");
		return "action";
	}
  /*  @RequestMapping(value="/movie/${name}", method=RequestMethod.GET)
    public String logg(Model model){
    	return "wReview";
    }*/
	@RequestMapping(value="/movie/action/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("genre","Action");
		return "add";
	}
	@RequestMapping(value="/movie/action/add",method=RequestMethod.POST)
	public String addActoin(@ModelAttribute("action") Action m){
		
		this.actionService.addActionMovie(m);
		return "redirect:/movie/Action";
	}
	@RequestMapping(value="/movie/action/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("review") String s,@PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId());
		r.setReview(s);
		r.setGenre("action");
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation("Atlanta");
		this.actionService.reviewActionMovie(r);
		return "redirect:/movie/Action";
	}
    @RequestMapping(value="/movie/action/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","Action");
    	System.out.println("I'm inside action controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.actionService.listReview("action",title,id));
    	return "views";
    }
    @RequestMapping(value="/movie/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }
}
