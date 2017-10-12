package com.vp.spring.serviceimpl;

import java.util.Random;

import com.vp.spring.service.BusinessService;

public class CloudBusinessService implements BusinessService{

	public String offerService(String countryName) {

		Random random = new Random();
		String stmt = "This Organization ,"+countryName+" offers wide range of cloud service "
				+ "where the revenue increase yearly and exceeded upto "+random.nextInt(revenue);
		return stmt;
				
	}
	

}
