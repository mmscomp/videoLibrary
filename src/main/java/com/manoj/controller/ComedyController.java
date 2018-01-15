package com.manoj.controller;
//import  com.manoj.LoginController;
//import com.manoj.model.Person;
import com.manoj.model.Comedy;
import com.manoj.model.Review;
import com.manoj.service.ComedyService;

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
public class ComedyController {
	private ComedyService comedyService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="comedyService")
	public void setMovieService(ComedyService cs){
		this.comedyService = cs;
	}
	@RequestMapping(value={" /movie/Comedy"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside Comedy Controller");
		model.addAttribute("comedy","Comedy");
		model.addAttribute("comedyMovie",this.comedyService.listComedyMovie());
		System.out.println("1");
		return "comedy";
	}
  /*  @RequestMapping(value="/movie/${name}", method=RequestMethod.GET)
    public String logg(Model model){
    	return "wReview";
    }*/
	@RequestMapping(value="/movie/Comedy/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("genre","Comedy");
		return "add";
	}
	@RequestMapping(value="/movie/Comedy/add",method=RequestMethod.POST)
	public String addComedy(@ModelAttribute("comedy") Comedy m){
		
		this.comedyService.addComedyMovie(m);
		return "redirect:/movie/Comedy";
	}
	@RequestMapping(value="/movie/Comedy/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("genre","Comedy");
		model.addAttribute("id", id);
		return "remove";
	}
	@RequestMapping(value="/movie/Comedy/{id}/delete",method=RequestMethod.POST)
	public String removeComedy(Model model, @PathVariable("id") int id){
		
		this.comedyService.removeComedyMovie(id);
		return "redirect:/movie/Comedy";
	}

	
	@RequestMapping(value="/movie/Comedy/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("comedy");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.comedyService.reviewComedyMovie(r);
		return "redirect:/movie/Comedy";
	}
    @RequestMapping(value="/movie/Comedy/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","Comedy");
    	System.out.println("I'm inside action controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.comedyService.listReview("comedy",title,id));
    	return "views";
    }
  /*  @RequestMapping(value="/movie/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }*/
    @RequestMapping(value="/movie/Comedy/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","Comedy");
      return "delReview";
    }
    @RequestMapping(value="/movie/Comedy/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.comedyService.removeComedyMovieReview(rID);
      return "redirect:/movie/Comedy";
    }
}
