package com.vp.springchallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge2 {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");
		City c = (City)ctx.getBean("city");
		System.out.println(c.cityName());
		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}
