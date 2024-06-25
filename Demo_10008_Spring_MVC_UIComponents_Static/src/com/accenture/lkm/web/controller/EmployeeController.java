package com.accenture.lkm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.EmployeeBean;

@Controller
public class EmployeeController {
	
	//Default method is Get
	@RequestMapping("/loadEmployeeRegistrationPage")
	public ModelAndView showRegistrationPage() {
		return new ModelAndView("Registration", "employeeBean",	new EmployeeBean());
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("employeeBean") EmployeeBean employeeBean) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("RegistrationSuccess");
		modelAndView.addObject("message", "Welcome: " + employeeBean.getName());
		return modelAndView;
	}
}