package com.acc.lkm.action;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.lkm.dao.UserDAO;
import com.acc.lkm.dto.Login;
import com.acc.lkm.dto.User;

@Controller
public class UserController {

	@Autowired
	private UserDAO userDao;

	@RequestMapping(value = "befreg", method = RequestMethod.GET)
	public String showRegForm(Model model) {

		model.addAttribute("usr", new User());
		return "register";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("usr") @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}
		userDao.save(user);
		System.out.println(userDao.getUserList());
		return "welcome";
	}

	@RequestMapping(value = "befLogin", method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}

	@RequestMapping(value = "afterlogin", method = RequestMethod.POST)
	public String verifyLoginForm(@ModelAttribute("login") @Valid Login login, BindingResult result) {
		boolean checkLogin = false;
		if (result.hasErrors()) {
			return "login";
		}
		for(User user: userDao.getUserList()) {
			if (user.getUsername().equals(login.getUsername()) && user.getPassword().equals(login.getPassword())) {
				checkLogin =  true;
			}
		}
		if (checkLogin) {
			return "loginSuccess";
		} else {
			return "loginError";
		}
	}

}
