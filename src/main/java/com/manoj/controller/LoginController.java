package com.manoj.controller;

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
//import org.springframework.web.bind.annotation.Repeatable;


import com.manoj.model.Login;
import com.manoj.service.LoginService;

@Controller
public class LoginController {
	
	private LoginService loginService;
	
	@Autowired(required=true)
//	@Resource
	@Qualifier(value="loginService")
	public void setLoginService(LoginService ls){
		this.loginService = ls;
	}
	@RequestMapping(value = {"/log/{genre}/{title}/{id}"}, method = RequestMethod.GET)
//	@Repeatable(value = "/", method = RequestMethod.GET)	

	public String log(@PathVariable String genre,@PathVariable String title, @PathVariable("id") int id, Model model) {
		
		System.out.println("35" + genre);
		model.addAttribute("genre", genre);
		model.addAttribute("mId", id);
		model.addAttribute("title", title);
	//	System.out.println(this.personService.listPerson());
		return "login";
	}
	@RequestMapping(value = "/log/register", method = RequestMethod.GET)
	public String register(Model model) {
	/*	model.addAttribute("genre", genre);
		model.addAttribute("title", title);
		model.addAttribute("id", id);*/
	//	System.out.println(this.personService.listPerson());
		return "register";
	}
    @RequestMapping(value = "/log/reset", method = RequestMethod.GET)
    public String reset(Model model){
    	return "reset";
    }
	
	@RequestMapping(value = "/log/{genre}/{title}/{id}/verify", method = RequestMethod.POST)
	public String loginVerify(@PathVariable("id") int mId,@PathVariable("title") String title, @PathVariable("genre") String gen,Model model,HttpServletRequest req, HttpServletResponse res){//("firstName")String name
			//(,@ModelAttribute("lastName") String passwd) {
		model.addAttribute("mId", mId);
		model.addAttribute("genre",gen);
		model.addAttribute("title", title);
		String name = req.getParameter("name");
		String pw = req.getParameter("password");
		model.addAttribute("listPerson", this.loginService.loginListPerson());
		System.out.println("4. "+name+" "+pw);
		for(Login x: this.loginService.loginListPerson()){
			System.out.println("5. "+x.getId()+" "+x.getUserName()+" "+x.getPasswd());
			if(name.equals(x.getUserName())&& pw.equals(x.getPasswd())){
				int k = x.getId();
				String us = x.getUserName();
				//String s = "redirect:/"+"movie/review/"+us+"/"+k;
				model.addAttribute("username",us);
	//			System.out.println("6. "+s);
				return "review";//"redirect:/diary/{k}";
			}
		}
		//System.out.println(listPerson());
		req.setAttribute("errorMessage","Incorrect credentials. Try again!");
		return "login";
	}
	
		
	//Fo r add and update person both
	@RequestMapping(value= "/log/register", method = RequestMethod.POST)
	public String addLogin(@ModelAttribute("login") Login p, HttpServletRequest req){
	//	model.addAttribute("loginListPerson", this.loginService.loginListPerson());
		if(p.getId() == 0){
			//new person, add it
	/*		String userName = r.getParameter("firstName");
			String passwd = r.getParameter("passwd");
			p.setUserName(userName);
			p.setPasswd(passwd);
			System.out.println("7. "+userName);*/
			for(Login x:this.loginService.loginListPerson()){
			   if(x.getUserName().equals(p.getUserName())||x.getPasswd().equals(p.getPasswd())){
				   String s ="UserName or password already taken! try again";
				   req.setAttribute("errorMessage", s);
				   System.out.println("UserName or password already taken! try again");
				   return "register";
			   }	
			}
			this.loginService.addLogin(p);
		}else{ 
			//existing person, call update
			System.out.println("9. "+p.getId());
			this.loginService.updateLogin(p);
		}
		
		return "login";
		
	}
	
	@RequestMapping("/login/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.loginService.removeLogin(id);
        return "redirect:/login";
    }
 
    @RequestMapping("/VideoLibrary/login/edit/{id}")
    public String editLogin(@PathVariable("id") int id, Model model){
  //      model.addAttribute("login", this.loginService.displayPerson(id));
        model.addAttribute("loginListperson", this.loginService.loginListPerson());
        return "login";
    }
	
}