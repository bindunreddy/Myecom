package com.niit.bnr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.bnr.dao.UserDAO;
import com.niit.bnr.model.User;

@Controller
public class SignupController {
	@Autowired
	UserDAO userDAO;

	@RequestMapping(value = "/getregisterform")
	public String go(Model model) {

		model.addAttribute("user", new User());

		return "register";
	}
	
	@PostMapping(value = "/insert")
	public ModelAndView addUser(@Valid @ModelAttribute("user") User user,HttpServletRequest request){
		
		
		userDAO.insertUser(user);	
		
		//return "/login";
		
		return new ModelAndView("success","message","Registered successfully. Please Click on Login");
	}
}
