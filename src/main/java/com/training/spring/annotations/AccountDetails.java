package com.training.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDetails {
	
	@Autowired
	private CustomerInfo cusInfo = null;
	@Autowired
	private Address add = null;
	
	public AccountDetails() {
		System.out.println("AccountDetails() constructor");
	}
	
	public CustomerInfo getCusInfo() {
		return cusInfo;
	}
	
	public Address getAddress() {
		return add;
	}
	
	public void setCusInfo(CustomerInfo cusInfo) {
		this.cusInfo = cusInfo;
	}
	
	public void setAddress(Address add) {
		this.add = add;
	}
	

	public void print() {
		cusInfo.print();
		add.print();
	}

}
