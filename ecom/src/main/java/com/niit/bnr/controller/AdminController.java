package com.niit.bnr.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.bnr.dao.CategoryDAO;
import com.niit.bnr.dao.ProductDAO;
import com.niit.bnr.model.Category;
import com.niit.bnr.model.Product;
import com.niit.bnr.utils.MyUtils;

//it is a controller, so annotation should be specified
@Controller
@RequestMapping("/admin")
public class AdminController {

	// Automatically injecting the dependency(Object of ProductDAO Impl )to
	// AdminController
	@Autowired
	ProductDAO prod;

	

	// http://localhost:8080/ecom/admin/adminform
	@RequestMapping(value = "/adminform")
	public ModelAndView show() {

		ModelAndView mv = new ModelAndView("admin");
		mv.addObject("products", prod.getAllProducts()); // displaying the list ProductObjects
		mv.addObject("product", new Product()); // creating a null object
		
	/*	mv.addObject("categories",category.getAllCategory());
		mv.addObject("category",new Category());
*/
		return mv;
	}

	@RequestMapping(value = "/product.do", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("product") Product product, BindingResult results,
			HttpServletRequest request, Model model) {

		if (results.hasErrors()) {
			model.addAttribute("products", prod.getAllProducts());
			return "admin/adminform";
		}

		prod.insert(product);
		MultipartFile file = product.getFile();
		if (file != null && file.getSize() > 0) {

			
			String originalFile = file.getOriginalFilename();

			String filePath = request.getSession().getServletContext().getRealPath("/resources/images/productimages/");
			System.out.println(filePath + "" + originalFile);

			String myFileName = filePath + product.getId() + ".jpg";
			System.out.println(myFileName);

			try {
				byte imagebyte[] = product.getFile().getBytes();
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(myFileName));
				fos.write(imagebyte);
				fos.close();

			} catch (Exception e) {
				System.out.println(MyUtils.uploadTo(file));
			}
		}

		return "redirect:/admin/adminform";

	}

	@RequestMapping(value = "/adminform/edit/{id}")
	public ModelAndView adminEdit(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("admin");
		// ProductModel product = pDAO.get(id);
		mv.addObject("product", prod.getProduct(id));
		mv.addObject("products", prod.getAllProducts());
		// mv.addObject("categories", cat.getAll()); // ADDED TO MAKE THE LIST
		// UPDATED WHILE EIDITING
		// PRODUCT OTHERWISE LIST
		// WILL COME EMPTY
		return mv;
	}

	@RequestMapping(value = { "/adminform/delete/{id}" })
	public String deleteProduct(@PathVariable("id") String id) {
		prod.deleteProduct(id);
		return "redirect:/admin/adminform";

	}
}
