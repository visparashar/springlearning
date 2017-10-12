package com.vp.springweb.scope.service;

public class RandomizeSessionScopeBean {
	private int randomNumber =10;
	
	public int getRandomNumber(){
		return randomNumber;
	}
	
	public int generateRequestSequenceNumber(){
		
		randomNumber =(int) (Math.random()*9999);
		return randomNumber;
		
	}

}
