package com.accenture.lkm.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.JavaLearningBean;
import com.accenture.lkm.service.TrainingService;

//1.13-> Make this class as Controller
//1.14-> Add session to transfer data from Model to session
@SuppressWarnings("unused")
public class TrainingController {
	//1.15-> Inject Service to call the methods
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	    
	    binder.registerCustomEditor(Date.class,"training_startDate", new CustomDateEditor(sdf, true));
	    binder.registerCustomEditor(Date.class,"training_endDate", new CustomDateEditor(sdf, true));
	}
	
	//1.16-> Add the request mapping url
	//1.17-> Define the methods and add data in model and display the response
	//1.18-> For Update operation data should be transferred to Session
}
