package com.manoj.controller;
//import  com.manoj.LoginController;
//import com.manoj.model.Person;
import com.manoj.model.LiveTV;
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
public class LiveTVController {
	private LiveTVService liveTVService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="liveTVService")
	public void setMovieService(LiveTVService ls){
		this.liveTVService = ls;
	}
	@RequestMapping(value={"/movie/LiveTV"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside LiveTV Controller");
		model.addAttribute("liveTV","LiveTV");
		model.addAttribute("liveTV",this.liveTVService.listLiveTV());
		System.out.println("1");
		return "liveTV";
	}
  /*  @RequestMapping(value="/movie/${name}", method=RequestMethod.GET)
    public String logg(Model model){
    	return "wReview";
    }*/
	@RequestMapping(value="/movie/LiveTV/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("genre","LiveTV");
		return "add";
	}
	@RequestMapping(value="/movie/LiveTV/add",method=RequestMethod.POST)
	public String addHorror(@ModelAttribute("LiveTV") LiveTV m){
		
		this.liveTVService.addLiveTV(m);
		return "redirect:/movie/LiveTV";
	}
	@RequestMapping(value="/movie/LiveTV/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("genre","LiveTV");
		model.addAttribute("id", id);
		return "remove";
	}
	@RequestMapping(value="/movie/LiveTV/{id}/delete",method=RequestMethod.POST)
	public String removeLiveTV(Model model, @PathVariable("id") int id){
		
		this.liveTVService.removeLiveTV(id);
		return "redirect:/movie/LiveTv";
	}

	
	@RequestMapping(value="/movie/LiveTV/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review();
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("LiveTV");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.liveTVService.reviewLiveTV(r);
		return "redirect:/movie/LiveTV";
	}
    @RequestMapping(value="/movie/LiveTV/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","LiveTV");
    	System.out.println("I'm inside liveTV controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.liveTVService.listReview("liveTV",title,id));
    	return "views";
    }
   /* @RequestMapping(value="/movie/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }*/
    @RequestMapping(value="/movie/LiveTV/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","LiveTV");
      return "delReview";
    }
    @RequestMapping(value="/movie/LiveTV/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.liveTVService.removeLiveTVReview(rID);
      return "redirect:/movie/LiveTV";
    }
}
