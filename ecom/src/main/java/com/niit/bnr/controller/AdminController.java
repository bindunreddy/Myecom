package com.niit.bnr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.bnr.dao.ProductDAO;

//it is a controller, so annotation should be specified
@Controller

public class AdminController {

	// We will do a mapping, so for this i need @RequestMapping annotation
	@Autowired
	ProductDAO product;

	@RequestMapping(value = "/adminform")

	public ModelAndView add() {

		ModelAndView mv = new ModelAndView("admin");
		mv.addObject("products", product.getAllProducts());

		return mv;
	}

}
