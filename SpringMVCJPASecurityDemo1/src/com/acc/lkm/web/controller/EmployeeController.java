package com.acc.lkm.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.exceptions.InvalidUpdateOpExc;
import com.acc.lkm.service.EmployeeService;

@Controller
@SessionAttributes({"empObj","empObj2"})
@SuppressWarnings("unused")
public class EmployeeController {
	@Autowired
	
	private EmployeeService employeeService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		binder.registerCustomEditor(Date.class, "insertTime",new CustomDateEditor(sdf, true));
	}
	//Saving Employee
	@RequestMapping(value="/LoadEmployee",method=RequestMethod.GET)
	public ModelAndView loadSaveEmployee()throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("CreateEmployee");
		modelAndView.addObject("empObj",new EmployeeBean());
		return modelAndView;
		
		
	}
	@RequestMapping(value="/saveEmployee",method=RequestMethod.GET)
	public ModelAndView SaveEmployee(@ModelAttribute("empObj") EmployeeBean employeeBean/*,ModelMap map,HttpServletRequest req,HttpSession sess*/)throws Exception{
		int i=employeeService.addEmployee(employeeBean);
		//System.out.println("Model Data: "+map.get("empObj"));
		//System.out.println("Request: "+req.getAttribute("empObj"));
		//System.out.println("Session: "+sess.getAttribute("empObj"));
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("CreateEmployeeSuccess");
		modelAndView.addObject("message","EmployeeBean added Successfully with :"+i);
		return modelAndView;
		
		
	}
	
	//Updating Employee
	
	@RequestMapping(value="/LoadUpdateEmployee",method=RequestMethod.GET)
	public ModelAndView loadUpdateEmployee()throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("UpdateEmployee");
		modelAndView.addObject("empObj",new EmployeeBean());
		return modelAndView;
	}
	//After execution of this method empObj will be stored in session scope 
		@RequestMapping(value="/LoadUpdateEmployee2",method=RequestMethod.POST)
		public ModelAndView loadUpdateEmployee2(@ModelAttribute("empObj") EmployeeBean EmployeeBean/*,ModelMap map,HttpServletRequest req,HttpSession sess*/)throws Exception{

            EmployeeBean employee2=employeeService.getEmployeeDetails(EmployeeBean.getId());
          //  System.out.println("Model Data: "+map.get("empObj"));
    		//System.out.println("Request: "+req.getAttribute("empObj"));
    		//System.out.println("Session: "+sess.getAttribute("empObj"));
			ModelAndView modelAndView=new ModelAndView();
			System.out.println("Hi New Model data ");
			modelAndView.setViewName("UpdateEmployee");
			
			//Retrives data from session and store in new model "empObj2
			modelAndView.addObject("empObj2",employee2);
			return modelAndView;
		}
		//After execution of this handler empObj2 will be stored in SessionScope
		@RequestMapping(value="/UpdateEmployee",method=RequestMethod.POST)
		public ModelAndView updateEmployee(@ModelAttribute("empObj2") EmployeeBean EmployeeBean/*,ModelMap map,HttpServletRequest req,HttpSession sess*/)throws Exception{
			EmployeeBean employee2=employeeService.updateEmployeeDetails(EmployeeBean);
			// System.out.println("Model Data: "+map.get("empObj"));
	    	//	System.out.println("Request: "+req.getAttribute("empObj"));
	    	//	System.out.println("Session: "+sess.getAttribute("empObj"));
			ModelAndView modelAndView=new ModelAndView();
			System.out.println("Hi New Session data ");
			modelAndView.setViewName("UpdateEmployeeSuccess");
			return modelAndView;
			
			
		}
		@ExceptionHandler(value=InvalidUpdateOpExc.class)
			public ModelAndView handleInvalidUpdateOperationException(InvalidUpdateOpExc exception) {
				ModelAndView modelAndView=new ModelAndView();
				modelAndView.addObject("message",exception.getMessage());
				modelAndView.addObject("exception",exception);
				modelAndView.addObject("empObj",new EmployeeBean());
				modelAndView.addObject("UpdateEmployee");
				return modelAndView;
				
			}
		//Error handler
		@ExceptionHandler (value=Exception.class)
		public ModelAndView handleAllExceptions(Exception exception) {
			ModelAndView modelAndView=new ModelAndView();;
			modelAndView.setViewName("GeneralizedExceptionHandlerPage");
			modelAndView.addObject("message",exception.getMessage());
			modelAndView.addObject("exception",exception);
			return modelAndView;
		}
		}
	

