package com.simplilearn.ecomorg.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.ecomorg.model.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	List<Product>  products = new ArrayList<Product>();
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getAllProducts() {
		ModelAndView modelAndView = new ModelAndView("list-products");
		// products.add(new Product(100,"Apple Mac book","It is Laptop","APPQ1234E",null,0,50033,new Date(),5));
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	// load add-products.jsp  or load add product form
	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public ModelAndView addProduct() {
		ModelAndView modelAndView = new ModelAndView("add-product");
		Product product = new Product();
		modelAndView.addObject("product", product);
		return modelAndView;
	}
	
	// save a product
	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("product") Product product) {
		ModelAndView modelAndView = new ModelAndView("list-products");
		products.add(product);
		modelAndView.addObject("products", products);
		return modelAndView;
	}
}
