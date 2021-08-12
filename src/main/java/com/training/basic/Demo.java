package com.training.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		try {
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("basic.xml");
		AccountDetails acc = ctx.getBean(AccountDetails.class);
		acc.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
