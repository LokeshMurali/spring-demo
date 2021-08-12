package com.training.basic;

public class CustomerInfo {
	
	private String name;
	
	public CustomerInfo() {
		System.out.println("CustomerInfo() constructor");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Print customer information");
	}

}
