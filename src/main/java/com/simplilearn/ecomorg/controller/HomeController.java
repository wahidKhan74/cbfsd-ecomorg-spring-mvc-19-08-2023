package com.simplilearn.ecomorg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/hello")
	public ModelAndView helloMapping() {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server", "Spring MVC Server");
		mv.addObject("message", "Serve is up and running !");
		return mv;
	}

	@RequestMapping("/message")
	public ModelAndView messageMapping(@RequestParam(name="message") String message) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server", "Spring MVC Server");
		mv.addObject("message", message);
		return mv;
	}

	@RequestMapping("/user")
	public ModelAndView messageMapping(@RequestParam(name="user") String user, @RequestParam(name="message") String message) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server", user);
		mv.addObject("message", message);
		return mv;
	}
}
