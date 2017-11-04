package com.manoj.controller;
//import  com.manoj.LoginController;
//import com.manoj.model.Person;
import com.manoj.model.Drama;
import com.manoj.model.Review;
import com.manoj.service.DramaService;

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
public class DramaController {
	private DramaService dramaService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="dramaService")
	public void setMovieService(DramaService ds){
		this.dramaService = ds;
	}
	@RequestMapping(value={"/movie/Drama"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside Drama Controller");
		model.addAttribute("drama","Drama");
		model.addAttribute("dramaMovie",this.dramaService.listDramaMovie());
		System.out.println("1");
		return "drama";
	}
  /*  @RequestMapping(value="/movie/${name}", method=RequestMethod.GET)
    public String logg(Model model){
    	return "wReview";
    }*/
	@RequestMapping(value="/movie/Drama/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("genre","Drama");
		return "add";
	}
	@RequestMapping(value="/movie/Drama/add",method=RequestMethod.POST)
	public String addDrama(@ModelAttribute("drama") Drama m){
		
		this.dramaService.addDramaMovie(m);
		return "redirect:/movie/Drama";
	}
	@RequestMapping(value="/movie/Drama/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("genre","Drama");
		model.addAttribute("id", id);
		return "remove";
	}
	@RequestMapping(value="/movie/Drama/{id}/delete",method=RequestMethod.POST)
	public String removeDrama(Model model, @PathVariable("id") int id){
		
		this.dramaService.removeDramaMovie(id);
		return "redirect:/movie/Drama";
	}

	
	@RequestMapping(value="/movie/Drama/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("drama");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.dramaService.reviewDramaMovie(r);
		return "redirect:/movie/Drama";
	}
    @RequestMapping(value="/movie/Drama/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","Drama");
    	System.out.println("I'm inside action controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.dramaService.listReview("drama",title,id));
    	return "views";
    }
  /*  @RequestMapping(value="/movie/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }*/
    @RequestMapping(value="/movie/Drama/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","Drama");
      return "delReview";
    }
    @RequestMapping(value="/movie/Drama/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.dramaService.removeDramaMovieReview(rID);
      return "redirect:/movie/Drama";
    }
}
