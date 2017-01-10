package com.niit.bnr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.bnr.dao.ProductDAO;
import com.niit.bnr.model.Product;

//it is a controller, so annotation should be specified
@Controller

public class AdminController {

	// We will do a mapping, so for this i need @RequestMapping annotation
	@Autowired
	ProductDAO prod;

	@RequestMapping(value = "/adminform")

	public ModelAndView show() {

		ModelAndView mv = new ModelAndView("admin");
		mv.addObject("products", prod.getAllProducts());
		mv.addObject("product", new Product());

		return mv;
	}

	@RequestMapping(value = "/product.do", method = RequestMethod.POST)

	public String add(@Valid @ModelAttribute("product") Product product, BindingResult results,
			HttpServletRequest request, Model model) {

		if (results.hasErrors()) {
			model.addAttribute("products", prod.getAllProducts());
			return "admin";
		}

		prod.insert(product);
		
		System.out.println(prod + "" +product);
		return "redirect:/adminform";

	}
	@RequestMapping(value = "/adminform/edit/{id}", method = RequestMethod.POST)
	public ModelAndView adminEdit(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("admin");
		// ProductModel product = pDAO.get(id);
		mv.addObject("product", prod.getProduct(id));
		mv.addObject("products", prod.getAllProducts());
		//mv.addObject("categories", cat.getAll()); // ADDED TO MAKE THE LIST
													// UPDATED WHILE EIDITING
													// PRODUCT OTHERWISE LIST
													// WILL COME EMPTY
		return mv;
	}

	@RequestMapping(value = { "/adminform/delete/{id}" })
	public String deleteProduct(@PathVariable("id") String id) {
		prod.deleteProduct(id);
		return "redirect:/adminform";

	}

}
