package com.vp.spring.serviceimpl;

import java.util.Random;

import com.vp.spring.service.BusinessService;

public class ECommerceBusinessService implements BusinessService {

	public String offerService(String countryName) {

		Random random = new Random();
		String query = "\n This Organization , "+countryName+" Provide the online store services"
				+ "Generating Annual revenue of "+random.nextInt(revenue);
		return query;
		
	}

}
