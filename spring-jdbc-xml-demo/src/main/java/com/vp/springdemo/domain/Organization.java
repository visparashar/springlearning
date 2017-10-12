package com.vp.springdemo.domain;

public class Organization {
	
	private String slogan;
	private int totalEmployee;
	private int yearOfIncorporation;
	private String name;
	private String address;
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}
	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Organization [slogan=" + slogan + ", totalEmployee=" + totalEmployee + ", yearOfIncorporation="
				+ yearOfIncorporation + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
