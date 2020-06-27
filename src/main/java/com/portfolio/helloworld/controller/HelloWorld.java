package com.portfolio.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		return modelAndView;
	}
	
}
