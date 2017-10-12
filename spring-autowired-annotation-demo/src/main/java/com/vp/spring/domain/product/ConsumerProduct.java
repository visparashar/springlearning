package com.vp.spring.domain.product;

import java.util.Random;

public class ConsumerProduct extends GenericProduct {

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
//		return 0;
		Random rm  = new Random();
		return rm.nextInt(price);
		
	}

}
