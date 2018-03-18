package com.manoj.controller;

import com.manoj.model.ComputerScience;
import com.manoj.model.Review;
import com.manoj.service.ComputerScienceService;

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
//import com.manoj.service.*;
@Controller
public class ComputerScienceController {
	private ComputerScienceService compService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="compService")
	public void setComputerScienceService(ComputerScienceService cs){
		this.compService = cs;
	}
	@RequestMapping(value={"/edu/ComputerScience"}, method=RequestMethod.GET)
	public String log(Model model){
		System.out.println("Im 34 inside CS Controller");
		model.addAttribute("comp","ComputerScience");
		model.addAttribute("compEdu",this.compService.listCompEdu());
		System.out.println("1");
		return "computerScience";
	}
	@RequestMapping(value="/edu/ComputerScience/add",method=RequestMethod.GET)
	public String add(Model model){
		
		System.out.println(4 + "inside CS add");
		model.addAttribute("field","ComputerScience");
		return "addEdu";
	}
	@RequestMapping(value="/edu/ComputerScience/add",method=RequestMethod.POST)
	public String addComp(@ModelAttribute("computerScience") ComputerScience m){
		System.out.println(4 + "inside CS add post");
	
		this.compService.addCompEdu(m);
		return "redirect:/edu/ComputerScience";
	}
	@RequestMapping(value="/edu/ComputerScience/{id}/delete",method=RequestMethod.GET)
	public String remove(Model model, @PathVariable("id") int id){
		model.addAttribute("field","ComputerScience");
		model.addAttribute("id", id);
		return "removeEdu";
	}
	@RequestMapping(value="/edu/ComputerScience/{id}/delete",method=RequestMethod.POST)
	public String removeComp(Model model, @PathVariable("id") int id, HttpServletRequest req){
		String user = req.getParameter("user");
		String password = req.getParameter("pass");
		List<ComputerScience> cs = this.compService.listCompEdu();
		for(ComputerScience x: cs){
		   if(x.getUsername().equals(user)&& x.getPasswd().equals(password)){
			this.compService.removeCompEdu(id);
			return "redirect:/edu/ComputerScience";
			
		   }
		}
		req.setAttribute("errorMessage","Youre not authorized to take this action");
        model.addAttribute("field", "ComputerScience");
		return "removeEdu";
	}

	
	@RequestMapping(value="/edu/ComputerScience/{title}/{id}/{uName}",method=RequestMethod.POST)
	public String review(@ModelAttribute("name") String s, @ModelAttribute("loc") String location, @PathVariable("title") String title, @PathVariable("uName")String user,@PathVariable("id")int id){
		Review r = new Review(); 
		System.out.println("000. "+r.getId() + s);
		r.setReview(s);
		r.setGenre("physics");
		r.setTitle(title);
		r.setMovieId(id);
		r.setUser(user);
		r.setLocation(location);
		this.compService.reviewCompEdu(r);
		return "redirect:/edu/ComputerScience";
	}
    @RequestMapping(value="/edu/ComputerScience/{title}/{id}/views", method=RequestMethod.GET)
    public String views(Model model,@PathVariable String title, @PathVariable("id") int id){
    	model.addAttribute("genre","ComputerScience");
    	System.out.println("I'm inside CS controller/views");
    	model.addAttribute("mId",id);
    	model.addAttribute("title", title);
    	model.addAttribute("reviewList",this.compService.listReview("ComputerScience",title,id));
    	return "viewsEdu";
    }
  /*  @RequestMapping(value="/edu/login", method=RequestMethod.GET)
    public String logg(Model model){
    	return "login";
    }*/
    @RequestMapping(value="/edu/ComputerScience/{rID}", method=RequestMethod.GET)
    public String delReview(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      model.addAttribute("genre","ComputerScience");
      return "delReview";
    }
    @RequestMapping(value="/edu/ComputerScience/{rID}/remove", method=RequestMethod.POST)
    public String del(Model model, @PathVariable("rID") int rID){
      model.addAttribute("id", rID);
      this.compService.removeCompEduReview(rID);
      return "redirect:/edu/ComputerScience";
    }
}
