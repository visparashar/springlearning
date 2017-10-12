package com.vp.springweb.scope.service;

public class RandomizeRequestScopeBean {
	
	
	private int randomNumber =5;
	
	public int getRandomNumber(){
		return randomNumber;
	}
	
	public int generateRequestSequenceNumber(){
		
		randomNumber =(int) (Math.random()*9999);
		return randomNumber;
		
	}

}
