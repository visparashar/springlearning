package com.vp.spring;

public class Organization {
	
	
	private String slogan ="We Deliver the best";
	private String companyName;
	private int yearOfInCorporation;
	
//	public Organization(){}
	
	
	
	public Organization(String companyName, int yearOfIncorporation) {
		super();
		this.companyName = companyName;
		this.yearOfInCorporation = yearOfIncorporation;
	}



	public String getSlogan(){
		return slogan;
	}



	@Override
	public String toString() {
		return "Organization [slogan=" + slogan + ", companyName=" + companyName + ", yearOfIncorporation="
				+ yearOfInCorporation + "]";
	}
			

}
