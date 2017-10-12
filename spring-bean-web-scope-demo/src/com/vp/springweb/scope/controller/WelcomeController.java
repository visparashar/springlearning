package com.vp.springweb.scope.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vp.springweb.scope.service.RandomizeRequestScopeBean;
import com.vp.springweb.scope.service.RandomizeSessionScopeBean;

@Controller
public class WelcomeController {
	
	
	@Autowired
	RandomizeRequestScopeBean randomizeRequestScopeBean;
	
	@Autowired
	RandomizeSessionScopeBean randomizeSessionScopeBean;
	
	
	
	@RequestMapping("/")
	public void getWelcomeMessage(HttpServletResponse response) throws IOException{
		
		response.getWriter().write("*************************request Scope****************** \n");
		response.getWriter().write("Old number  "+randomizeRequestScopeBean.getRandomNumber()+"\n");
		randomizeRequestScopeBean.generateRequestSequenceNumber();
		response.getWriter().write("New number  "+randomizeRequestScopeBean.getRandomNumber()+"\n");
		response.getWriter().write("*************************session Scope****************** \n");
		response.getWriter().write("Old number  "+randomizeSessionScopeBean.getRandomNumber());
		randomizeSessionScopeBean.generateRequestSequenceNumber();
		response.getWriter().write("New number  "+randomizeSessionScopeBean.getRandomNumber());
		
//		return response;
		
		
		
		
		
	}

}
