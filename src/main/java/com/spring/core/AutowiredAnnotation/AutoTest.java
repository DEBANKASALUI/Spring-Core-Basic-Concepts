package com.spring.core.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/AutowiredAnnotation/autoconfig.xml");
		Employee employee1 = context.getBean("emp1", Employee.class);
		System.out.println(employee1);
	}

}
