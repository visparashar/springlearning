package com.vp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IOCApp2 {
	
	public static void main(String[] args) {
//		load the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");
		Organization or =ctx.getBean("com.vp.spring.Organization",Organization.class);
		System.out.println(or.getSlogan());
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
