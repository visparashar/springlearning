package com.vp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vp.spring.domain.Organization;


public class DISetterApp {
	
	public static void main(String[] args) {
//		load the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");
		Organization or =ctx.getBean("com.vp.spring.domain.Organization",Organization.class);
		Organization or1 = ctx.getBean("com.vp.spring.domain.Organization",Organization.class);
		System.out.println(or.getSlogan());
		or1.setEmployeeCount(4000);
		System.out.println(or);
		System.out.println(or1);
		if(or==or1)
		{
			System.out.println("Singolten scope test : or & or1 both are same");
		}else{
			System.out.println("Both or & or1 are not same");
		}
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
