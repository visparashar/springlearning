package com.vp.spring.domain;

import com.vp.spring.service.BusinessService;

public class Organization {
	
	
	private String slogan ="We Deliver the best";
	private String companyName;
	private int yearOfInCorporation;
	private int employeeCount;
	private String address;
	private BusinessService businessService;
	
//	public Organization(){}
	
	
	public Organization(String companyName, int yearOfIncorporation ,int employeeCount) {
		super();
		this.companyName = companyName;
		this.yearOfInCorporation = yearOfIncorporation;
		this.employeeCount =employeeCount;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}





	public String getAddress() {
		return address;
	}





	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}



	public void setAddress(String address) {
		this.address = address;
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
