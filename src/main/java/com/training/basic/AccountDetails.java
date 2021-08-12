package com.training.basic;

public class AccountDetails {
	
	private CustomerInfo cusInfo = null;
	private Address add = null;
	
	public AccountDetails() {
		System.out.println("AccountDetails() constructor");
		/*
		 * cusInfo = new CustomerInfo(); 
		 * add = new Address();
		 */
	}
	
	//Business logic
	public void print() {
		cusInfo.print();
		add.print();
	}
	
	public CustomerInfo getCusInfo() {
		return cusInfo;
	}
	
	public Address getAdd() {
		return add;
	}
	
	public void setCusInfo(CustomerInfo cusInfo) {
		System.out.println("Inside setCusInfo ...");
		this.cusInfo = cusInfo;
		
	}
	
	public void setAdd(Address add) {
		System.out.println("Inside setAdd ...");
		this.add = add;
	}
	
	

}
