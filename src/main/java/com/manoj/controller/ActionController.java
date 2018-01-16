package com.manoj.controller;
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
		model.addAttribute("act","Action");
		model.addAttribute("actionMovie",this.actionService.listActionMovie());
		System.out.println("1");
		return "action";
	}
	@RequestMapping(value="/movie/Action/add",method=RequestMethod.GET)
	public String add(Model model){
		
		System.out.println(4 + "inside action add");
		model.addAttribute("genre","Action");
		return "add";
	}
	@RequestMapping(value="/movie/Action/add",method=RequestMethod.POST)
	public String addActoin(@ModelAttribute("action") Action m){
		System.out.println(4 + "inside action add post");
	
		this.actionService.addActionMovie(m);
		return "redirect:/movie/Action";
	}
	@RequestMapping(value="/movie/Action/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("genre","Action");
		model.addAttribute("id", id);
		return "remove";
	}
	@RequestMapping(value="/movie/Action/{id}/delete",method=RequestMethod.POST)
	public String removeAction(Model model, @PathVariable("id") int id){
		
		this.actionService.removeActionMovie(id);
		return "redirect:/movie/Action";
	}

	
	@RequestMapping(value="/movie/Action/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("action");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.actionService.reviewActionMovie(r);
		return "redirect:/movie/Action";
	}
    @RequestMapping(value="/movie/Action/{title}/{id}/views", method=RequestMethod.GET)
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
    @RequestMapping(value="/movie/Action/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","Action");
      return "delReview";
    }
    @RequestMapping(value="/movie/Action/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.actionService.removeActionMovieReview(rID);
      return "redirect:/movie/Action";
    }
}
