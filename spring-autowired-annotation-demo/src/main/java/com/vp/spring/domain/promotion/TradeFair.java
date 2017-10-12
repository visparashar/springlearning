package com.vp.spring.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;

import com.vp.spring.domain.product.ConsumerProduct;
import com.vp.spring.domain.product.IndustrialProduct;

public class TradeFair {
	
	
	private ConsumerProduct consumerProduct;
	private IndustrialProduct industrialProduct;
	
	
	
	@Autowired
	public TradeFair(ConsumerProduct consumerProduct, IndustrialProduct industrialProduct) {
		super();
		this.consumerProduct = consumerProduct;
		this.industrialProduct = industrialProduct;
	}
//	@Autowired
//	public void setConsumerProduct(ConsumerProduct consumerProduct) {
//		this.consumerProduct = consumerProduct;
//	}
//	@Autowired
//	public void setIndustrialProduct(IndustrialProduct industrialProduct) {
//		this.industrialProduct = industrialProduct;
//	}
	public int declareIndustrialProductPrice(IndustrialProduct industrialProduct){
		return industrialProduct.calculatePrice();
		
	}
	public int declareConsuermProductPrice(ConsumerProduct consumerProduct){
		return consumerProduct.calculatePrice();
		
	}
	
	public String specialPromotionalPricing(){
		
		String str ="Industrial Product Promotional Price Rs "+declareConsuermProductPrice(consumerProduct)+" and"+
		"Consumer Product Promotional Price Rs "+declareConsuermProductPrice(consumerProduct);
		return str;
	}
	

}
