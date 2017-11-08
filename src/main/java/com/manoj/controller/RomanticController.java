package com.manoj.controller;
//import  com.manoj.LoginController;
//import com.manoj.model.Person;
import com.manoj.model.Romantic;
import com.manoj.model.Review;
import com.manoj.service.RomanticService;

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
public class RomanticController {
	private RomanticService romanticService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="romanticService")
	public void setMovieService(RomanticService rs){
		this.romanticService = rs;
	}
	@RequestMapping(value={"/movie/Romantic"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside Romantic Controller");
		model.addAttribute("romantic","Romantic");
		model.addAttribute("romanticMovie",this.romanticService.listRomanticMovie());
		System.out.println("1");
		return "romantic";
	}
  /*  @RequestMapping(value="/movie/${name}", method=RequestMethod.GET)
    public String logg(Model model){
    	return "wReview";
    }*/
	@RequestMapping(value="/movie/Romantic/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("genre","Romantic");
		return "add";
	}
	@RequestMapping(value="/movie/Romantic/add",method=RequestMethod.POST)
	public String addRomantic(@ModelAttribute("romantic") Romantic m){
		
		this.romanticService.addRomanticMovie(m);
		return "redirect:/movie/Romantic";
	}
	@RequestMapping(value="/movie/Romantic/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("genre","Romantic");
		model.addAttribute("id", id);
		return "remove";
	}
	@RequestMapping(value="/movie/romantic/{id}/delete",method=RequestMethod.POST)
	public String removeRomantic(Model model, @PathVariable("id") int id){
		
		this.romanticService.removeRomanticMovie(id);
		return "redirect:/movie/Romantic";
	}

	
	@RequestMapping(value="/movie/Romantic/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("romantic");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.romanticService.reviewRomanticMovie(r);
		return "redirect:/movie/Romantic";
	}
    @RequestMapping(value="/movie/Romantic/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","Romantic");
    	System.out.println("I'm inside action controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.romanticService.listReview("drama",title,id));
    	return "views";
    }
  /*  @RequestMapping(value="/movie/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }*/
    @RequestMapping(value="/movie/Romantic/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","Romantic");
      return "delReview";
    }
    @RequestMapping(value="/movie/Romantic/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.romanticService.removeRomanticMovieReview(rID);
      return "redirect:/movie/Romantic";
    }
}
