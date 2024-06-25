package com.accenture.lkm.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.DateRangeForm;
import com.accenture.lkm.business.bean.EmployeeBean;
import com.accenture.lkm.exceptions.InvalidUpdateOperationException;
import com.accenture.lkm.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// InitBinder method to handle Date format
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

	@RequestMapping(value = "/LoadGetDetailsInDateRange", method = RequestMethod.GET)
	public ModelAndView getEmployeesWithinDateRangePage() {
		ModelAndView modelAndView = new ModelAndView("GetEmployeeDetailsByDateRange");
		modelAndView.addObject("dateRangeForm", new DateRangeForm());
		return modelAndView;
	}


	@RequestMapping(value = "/LoadDeleteEmployeeByName", method = RequestMethod.GET)
	public ModelAndView getDeleteEmployeesByNamePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("DeleteEmployee");
		modelAndView.addObject("dateRangeForm", new DateRangeForm());
		return modelAndView;
	}

	@RequestMapping(value = "/GetDataWithinDateRange", method = RequestMethod.GET)
	public ModelAndView getEmployeesDataInDateRange(@ModelAttribute("dateRangeForm") DateRangeForm dateRangeForm)
			throws Exception {
		Date startDate = dateRangeForm.getFromDate();
		Date endDate = dateRangeForm.getToDate();

		ModelAndView modelAndView = new ModelAndView("ShowDataInDateRangePage");
		List<EmployeeBean> employees = employeeService.getEmployeeDetailsWithin(startDate, endDate);
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

	@RequestMapping(value = "/GetAllEmployeeNameAndIds", method = RequestMethod.GET)
	public ModelAndView getAllEmployeeNamesAndIds() throws Exception {
		Map<String, String> employeeNamesAndIds = employeeService.getAllEmployeeNameAndIds();
		ModelAndView modelAndView = new ModelAndView(); // Assuming EmployeeNamesAndIdsPage
		modelAndView.setViewName("GetAllEmployeeNameAndIds");
		modelAndView.addObject("employeeNamesAndIds", employeeNamesAndIds);
		return modelAndView;
	}

	// Error Handler
	@ExceptionHandler(value = Exception.class)
	public ModelAndView handleAllExceptions(Exception exception) {
		ModelAndView modelAndView = new ModelAndView("GeneralizedExceptionHandlerPage");
		modelAndView.addObject("message", exception.getMessage());
		modelAndView.addObject("exception", exception);
		return modelAndView;
	}
}
