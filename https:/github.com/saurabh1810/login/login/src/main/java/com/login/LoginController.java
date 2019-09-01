package com.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@Autowired
	private UserService service;
	
	
	@RequestMapping("/")
	public String saveUser() {

		return "registration";
	}
	
	@RequestMapping("/create")
	public String create(@ModelAttribute User user, Model model) {

		Key<User> user1 = service.create(user);

		return "create";

	}
	@RequestMapping("/l")
	public @ResponseBody ModelAndView login(HttpServletRequest req , HttpServletResponse res)
	{
		ModelAndView mv=new ModelAndView("l");
		String email=(String) req.getParameter("email");
		String pass=(String) req.getParameter("password");
		int x =service.find(email,pass);
		if(x==0) {
			User user=new User(email,pass);
			mv.addObject("user", user);
		}
		else
			System.out.println("value of x:"+x);
		return mv;
	}
	
	
}
