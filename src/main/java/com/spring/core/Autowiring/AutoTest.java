package com.spring.core.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/Autowiring/autoconfig.xml");
		Employee employee1 = context.getBean("emp1", Employee.class);
		System.out.println(employee1);
		Employee employee2 = context.getBean("emp2", Employee.class);
		System.out.println(employee2);
		Employee employee3 = context.getBean("emp3", Employee.class);
		System.out.println(employee3);

	}

}
