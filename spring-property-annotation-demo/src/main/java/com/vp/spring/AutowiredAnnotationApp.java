package com.vp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vp.spring.domain.Organization;
import com.vp.spring.domain.PropertyConfig;


public class AutowiredAnnotationApp {
	
	public static void main(String[] args) {

	ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
	Organization org =(Organization)ctx.getBean("myorg");
	System.out.println(org);
	}

}
