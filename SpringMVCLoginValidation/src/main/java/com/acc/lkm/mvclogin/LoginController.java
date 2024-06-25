package com.acc.lkm.mvclogin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
@RequestMapping(value="befLogin",method=RequestMethod.GET)
public String showLoginForm(Model model) {
	Login login=new Login();
	model.addAttribute("login",login);
	return "login";
}

@RequestMapping(value="afterlogin",method=RequestMethod.POST)
public String verifyLoginForm(@Valid Login login,BindingResult result) {
	if(result.hasErrors()) {
		return "login";
	}
	if(login.getUsername().equals("Admin")&& login.getPassword().equals("Accenture")) {
		return "loginSuccess";
	}
	else{
		return "loginError";
	}
}
}
