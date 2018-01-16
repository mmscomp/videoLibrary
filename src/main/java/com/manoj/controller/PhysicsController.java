package com.manoj.controller;

import com.manoj.model.Physics;
import com.manoj.model.Review;
import com.manoj.service.PhysicsService;

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
public class PhysicsController {
	private PhysicsService phyService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="phyService")
	public void setPhysicsService(PhysicsService ps){
		this.phyService = ps;
	}
	@RequestMapping(value={"/edu/Physics"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside PHY Controller");
		model.addAttribute("phy","Physics");
		model.addAttribute("phyEdu",this.phyService.listPhyEdu());
		System.out.println("1");
		return "physics";
	}
	@RequestMapping(value="/edu/Physics/add",method=RequestMethod.GET)
	public String add(Model model){
		
		System.out.println(4 + "inside physics add");
		model.addAttribute("field","Physics");
		return "add";
	}
	@RequestMapping(value="/edu/Physics/add",method=RequestMethod.POST)
	public String addPhy(@ModelAttribute("phy") Physics m){
		System.out.println(4 + "inside physics add post");
	
		this.phyService.addPhyEdu(m);
		return "redirect:/edu/Physics";
	}
	@RequestMapping(value="/edu/Physics/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("field","Physics");
		model.addAttribute("id", id);
		return "remove";
	}
	@RequestMapping(value="/edu/Physics/{id}/delete",method=RequestMethod.POST)
	public String removePhysics(Model model, @PathVariable("id") int id){
		
		this.phyService.removePhyEdu(id);
		return "redirect:/edu/Physics";
	}

	
	@RequestMapping(value="/edu/Physics/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("physics");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.phyService.reviewPhyEdu(r);
		return "redirect:/edu/Physics";
	}
    @RequestMapping(value="/edu/Physics/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","Physics");
    	System.out.println("I'm inside phy controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.phyService.listReview("phy",title,id));
    	return "views";
    }
  /*  @RequestMapping(value="/edu/Physics/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }*/
    @RequestMapping(value="/edu/Physics/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","Physics");
      return "delReview";
    }
    @RequestMapping(value="/edu/Physics/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.phyService.removePhyEduReview(rID);
      return "redirect:/edu/Physics";
    }
}
