package com.niit.bnr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.niit.bnr.dao.UserDAO;
import com.niit.bnr.model.User;


@Controller
public class SignupController {
	@Autowired
	UserDAO r ;	
	
	@PostMapping(value = "/insert")
	public String go(@Valid @ModelAttribute("user") User user1,HttpServletRequest request){
		
		
		r.insertUser(user1);	
		
		return "/login";
	}
}
