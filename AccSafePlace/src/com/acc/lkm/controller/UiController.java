package com.acc.lkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.acc.lkm.businessbean.PatientBean;
import com.acc.lkm.exceptions.InvalidUpdateOpExc;
import com.acc.lkm.service.PatientService;

@Controller
@SessionAttributes({ "patObj1", "patObj2" })
@SuppressWarnings("unused")
public class UiController {
	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/LoadPatient", method = RequestMethod.GET)
	public ModelAndView loadSaveEmployee() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("CreatePatient");
		System.out.println("Reaching Here 1");
		modelAndView.addObject("patObj1", new PatientBean());
		return modelAndView;
	}

	@RequestMapping(value = "/savePatient", method = RequestMethod.GET)
	public ModelAndView SaveEmployee(@ModelAttribute("patObj1") PatientBean patientBean) throws Exception {
		Long i = patientService.addPatient(patientBean);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("CreatePatientSuccess");
		modelAndView.addObject("message", "PatientBean added Successfully with :" + i);
		return modelAndView;
	}

	@RequestMapping(value = "/LoadUpdatePatient", method = RequestMethod.GET)
	public ModelAndView loadUpdatePatient() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("UpdatePatient");
		modelAndView.addObject("patObj1", new PatientBean());
		return modelAndView;
	}

	@RequestMapping(value = "/LoadUpdatePatient2", method = RequestMethod.POST)
	public ModelAndView loadUpdatePatient2(@ModelAttribute("patObj1") PatientBean patientBean) throws Exception {
		PatientBean patient = patientService.getPatient(patientBean.getId());
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Hi New Model data ");
		modelAndView.setViewName("UpdatePatient");
		modelAndView.addObject("patObj2", patient);
		return modelAndView;
	}

	// After execution of this handler patObj12 will be stored in SessionScope
	@RequestMapping(value = "/UpdateEmployee", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("patObj2") PatientBean patientBean) throws Exception {
		PatientBean employee2 = patientService.updatePatientDetails(patientBean);
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Hi New Session data ");
		modelAndView.setViewName("UpdatePatientSuccess");
		return modelAndView;

	}

	@RequestMapping(value = "/GetDetails", method = RequestMethod.GET)
	public ModelAndView getAllEmployees() throws Exception {
		List<PatientBean> list = patientService.getPatientList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("GetAllPatientDetails");
		modelAndView.addObject("patList", list);
		return modelAndView;

	}

	@ExceptionHandler(value = InvalidUpdateOpExc.class)
	public ModelAndView handleInvalidUpdateOperationException(InvalidUpdateOpExc exception) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", exception.getMessage());
		modelAndView.addObject("exception", exception);
		modelAndView.addObject("patObj1", new PatientBean());
		modelAndView.addObject("UpdatePatient");
		return modelAndView;

	}

	// Error handler
	@ExceptionHandler(value = Exception.class)
	public ModelAndView handleAllExceptions(Exception exception) {
		ModelAndView modelAndView = new ModelAndView();
		;
		modelAndView.setViewName("GeneralizedExceptionHandlerPage");
		modelAndView.addObject("message", exception.getMessage());
		modelAndView.addObject("exception", exception);
		return modelAndView;
	}
}
