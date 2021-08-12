package com.training.basic;

public class Address {
	
	private String street;
	
	public Address() {
		System.out.println("Address() constructor");
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void print() {
		System.out.println("Print Address");
	}

}
