package com.vp.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vp.springmvc.service.GenericWelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	GenericWelcomeService welcomeSerivce;
	
	@RequestMapping("/")
	public String doWelcome(Model model){
//		Retrieved the processed data
//		WelcomeService service = new WelcomeService();
		List<String> welcomeList = welcomeSerivce.getWelcomeMessage("Vishal");
		
//		add data to model
		model.addAttribute("myWelcomeMessage",welcomeList);	
		
//		return logical view name
		return "welcomeWithService";
		
	}

}
