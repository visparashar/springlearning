package com.vp.springmvc.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService {
	
	
	public List<String> getWelcomeMessage(String name){
		
		List<String> welcomeList = new ArrayList<String>();
		welcomeList.add("Hello, ");
		welcomeList.add(name);
		welcomeList.add(" welcome to spring course");
		
		return welcomeList;
	}

}
