package com.vp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vp.spring.service.BusinessService;


public class PreInitPreDestrioyApp {
	
	@Autowired
	BusinessService businessService;
	
	public static void main(String[] args) {
//		load the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");
	/*	Organization or =ctx.getBean("com.vp.spring.Organization",Organization.class);
		System.out.println(or.getSlogan());
		System.out.println(or);*/
//		businessService.offerService();
		PreInitPreDestrioyApp app = new PreInitPreDestrioyApp();
		System.out.println(app.getI());
		((ClassPathXmlApplicationContext)ctx).close();
	}
	
	public String getI(){
		return businessService.offerService("India");
	}

}
