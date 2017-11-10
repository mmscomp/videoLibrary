package com.manoj.controller;
//import  com.manoj.LoginController;
//import com.manoj.model.Person;
import com.manoj.model.Horror;
import com.manoj.model.Review;
import com.manoj.service.HorrorService;

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
public class HorrorController {
	private HorrorService horrorService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="horrorService")
	public void setMovieService(HorrorService hs){
		this.horrorService = hs;
	}
	@RequestMapping(value={"/movie/Horror"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside Horror Controller");
		model.addAttribute("horror","Horror");
		model.addAttribute("horrorMovie",this.horrorService.listHorrorMovie());
		System.out.println("1");
		return "horror";
	}
  /*  @RequestMapping(value="/movie/${name}", method=RequestMethod.GET)
    public String logg(Model model){
    	return "wReview";
    }*/
	@RequestMapping(value="/movie/Horror/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("genre","Horror");
		return "add";
	}
	@RequestMapping(value="/movie/Horror/add",method=RequestMethod.POST)
	public String addHorror(@ModelAttribute("horror") Horror m){
		
		this.horrorService.addHorrorMovie(m);
		return "redirect:/movie/Horror";
	}
	@RequestMapping(value="/movie/Horror/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("genre","Horror");
		model.addAttribute("id", id);
		return "remove";
	}
	@RequestMapping(value="/movie/Horror/{id}/delete",method=RequestMethod.POST)
	public String removeHorror(Model model, @PathVariable("id") int id){
		
		this.horrorService.removeHorrorMovie(id);
		return "redirect:/movie/Horror";
	}

	
	@RequestMapping(value="/movie/Horror/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("horror");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.horrorService.reviewHorrorMovie(r);
		return "redirect:/movie/Horror";
	}
    @RequestMapping(value="/movie/Horror/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","Horror");
    	System.out.println("I'm inside horror controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.horrorService.listReview("horror",title,id));
    	return "views";
    }
   /* @RequestMapping(value="/movie/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }*/
    @RequestMapping(value="/movie/Horror/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","Horror");
      return "delReview";
    }
    @RequestMapping(value="/movie/Horror/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.horrorService.removeHorrorMovieReview(rID);
      return "redirect:/movie/Horror";
    }
}
