package com.vp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vp.spring.domain.Organization;


public class InitDestrioyApp {
	
	public static void main(String[] args) {
//		load the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");
	/*	Organization or =ctx.getBean("com.vp.spring.Organization",Organization.class);
		System.out.println(or.getSlogan());
		System.out.println(or);*/
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
