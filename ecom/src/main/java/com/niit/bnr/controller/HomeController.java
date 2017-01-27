package com.niit.bnr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.bnr.dao.ProductDAO;
import com.niit.bnr.model.Product;

@Controller

public class HomeController {
@Autowired
ProductDAO prodDAO;
	@RequestMapping(value={"/","/index"})
	public ModelAndView hello(){
		ModelAndView model=new ModelAndView("index");
		return model;
	}
	@RequestMapping(value={"/about"})
	public ModelAndView about(){
		ModelAndView model=new ModelAndView("about");
		return model;
	}
	@RequestMapping(value={"/register"})
	public ModelAndView register(){
		ModelAndView model=new ModelAndView("register");
		return model;
	}
	@RequestMapping(value={"/login"})
	public ModelAndView login(){
		ModelAndView model=new ModelAndView("login");
		return model;
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contact(){
		ModelAndView model=new ModelAndView("contact");
		return model;
	}
	
	@RequestMapping("/product/all")
	public @ResponseBody List<Product> getproduct()
	{
		return prodDAO.getAllProducts();
	}
	@RequestMapping(value={"/product"})
	public ModelAndView product(){
		ModelAndView model=new ModelAndView("product");
		return model;
	}
	@RequestMapping(value={"/fictionnovels"})
	public ModelAndView fictionnovels(){
		ModelAndView model=new ModelAndView("fictionnovels");
		return model;
	}
	@RequestMapping(value={"/lovenovels"})
	public ModelAndView lovenovels(){
		ModelAndView model=new ModelAndView("lovenovels");
		return model;
	}
	@RequestMapping(value={"/comics"})
	public ModelAndView comics(){
		ModelAndView model=new ModelAndView("comics");
		return model;
	}
	
}

