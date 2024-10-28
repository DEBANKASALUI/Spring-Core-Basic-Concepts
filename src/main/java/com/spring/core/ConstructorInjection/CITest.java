package com.spring.core.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CITest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/ConstructorInjection/ciconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);

		Addition add = (Addition) context.getBean("add");
		add.doSum();

	}

}
