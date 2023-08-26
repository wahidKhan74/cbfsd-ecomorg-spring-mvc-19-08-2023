package com.simplilearn.ecomorg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.ecomorg.dao.ProductDao;
import com.simplilearn.ecomorg.model.Product;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductDao productDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getAllProducts() {
		ModelAndView modelAndView = new ModelAndView("list-products");
		List<Product> products = productDao.getAllProducts();
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	// load add-products.jsp or load add product form
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
		// save product data
		int rowsAffted = productDao.addProduct(product);
		System.out.println("No of records added " + rowsAffted);

		// read all products
		List<Product> products = productDao.getAllProducts();
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	// load add-products.jsp or load add product form
	@RequestMapping(value = "/delete-product", method = RequestMethod.GET)
	public ModelAndView deleteProduct() {
		ModelAndView modelAndView = new ModelAndView("delete-product");
		Product product = new Product();
		modelAndView.addObject("product", product);
		return modelAndView;
	}

	// save a product
	@RequestMapping(value = "/delete-product", method = RequestMethod.POST)
	public ModelAndView deleteProduct(@ModelAttribute("product") Product product) {
		ModelAndView modelAndView = new ModelAndView("list-products");
		// save product data
		int rowsAffted = productDao.deleteProduct(product.getProductId());
		System.out.println("No of records added " + rowsAffted);

		// read all products
		List<Product> products = productDao.getAllProducts();
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	// Delete product
	@RequestMapping(value = "/delete/{productId}", method = RequestMethod.GET)
	public ModelAndView deleteProduct(@PathVariable int productId) {
		ModelAndView modelAndView = new ModelAndView("list-products");
		// save product data
		int rowsAffted = productDao.deleteProduct(productId);
		System.out.println("No of records added " + rowsAffted);

		// read all products
		List<Product> products = productDao.getAllProducts();
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	// load update-products.jsp or load add product form
	@RequestMapping(value = "/update/{productId}", method = RequestMethod.GET)
	public ModelAndView updateProduct(@PathVariable int productId) {
		ModelAndView modelAndView = new ModelAndView("update-product");
		Product product = productDao.getOneProduct(productId);
		modelAndView.addObject("product", product);
		return modelAndView;
	}

	// save a product
	@RequestMapping(value = "/update-product", method = RequestMethod.POST)
	public ModelAndView updateProduct(@ModelAttribute("product") Product product) {
		System.out.println(product);
		ModelAndView modelAndView = new ModelAndView("list-products");
		// save product data
		int rowsAffted = productDao.updateProduct(product);
		System.out.println("No of records updated " + rowsAffted);

		// read all products
		List<Product> products = productDao.getAllProducts();
		modelAndView.addObject("products", products);
		return modelAndView;
	}

}
