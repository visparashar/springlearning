package com.vp.spring.domain;

import java.io.Serializable;

import com.vp.spring.service.BusinessService;

public class Organization {
		
	private String slogan ="We Deliver the best";
	private String companyName;
	private int yearOfInCorporation;
	private int employeeCount;
	private String address;
	private BusinessService businessService;
	
	
	
	
	public Organization(){
		System.out.println("default contructor called");
		
	}
	
	
	public Organization(String companyName, int yearOfIncorporation ,int employeeCount) {
		super();
		this.companyName = companyName;
		this.yearOfInCorporation = yearOfIncorporation;
		this.employeeCount =employeeCount;
		System.out.println(" contructor called");
	}
	
	public void initialize(){
		System.out.println("Organization: initialize called");
	}
	public void destroy(){
		System.out.println("Organization: destroy called");
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("getBusinessServicer called");
	}

	public int getEmployeeCount() {
		return employeeCount;
	}





	public String getAddress() {
		return address;
	}





	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("setEmployeeCount called");
	}



	public void setAddress(String address) {
		this.address = address;
		System.out.println("setAddress called");
	}



	@Override
	public String toString() {
		return "Organization [slogan=" + slogan + ", companyName=" + companyName + ", yearOfInCorporation="
				+ yearOfInCorporation + ", employeeCount=" + employeeCount + ", address=" + address + "]";
	}


	public String getSlogan() {
		// TODO Auto-generated method stub
		return slogan;
	}
			

}
