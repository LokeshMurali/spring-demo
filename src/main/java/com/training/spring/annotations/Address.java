package com.training.spring.annotations;

import org.springframework.stereotype.Component;

@Component
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
		System.out.println("Printing Address");
	};

}
