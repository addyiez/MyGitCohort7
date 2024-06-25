package com.acc.lkm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="hello",method=RequestMethod.GET)
	public String sayHello() {
		System.out.println("Hi Controller");
		return "hi";
	}
    @RequestMapping(value="Accenture",method=RequestMethod.GET)
    public ModelAndView sayAcc() {
    	ModelAndView modelAndView=new ModelAndView("some","Name","Accenture");
		return modelAndView;
    }
}
