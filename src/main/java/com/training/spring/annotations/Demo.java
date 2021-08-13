package com.training.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springanno.xml");
		AccountDetails acc = ctx.getBean(AccountDetails.class);
		acc.print();
		ctx.close();
		
	}
}
