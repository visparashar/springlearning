package com.vp.springchallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("bean.xml");
		City c = (City)ctx.getBean("city");
		System.out.println(c.cityName());
		((FileSystemXmlApplicationContext)ctx).close();
		
	}

}
