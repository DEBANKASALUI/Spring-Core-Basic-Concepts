package com.spring.core.SpringRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/SpringRef/refconfig.xml");
		Company company = (Company) context.getBean("company1");
		System.out.println(company);
		System.out.println(company.getCompanyName());
		System.out.println(company.getLabour().getLabourName());
		
		Labour labour = (Labour) context.getBean("labour1");
		System.out.println(labour);
	}

}
