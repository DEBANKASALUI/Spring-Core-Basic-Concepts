package com.spring.core.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/standalone/collections/aloneconfig.xml");

		Person person = context.getBean("person1", Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getFees());
		System.out.println(person.getFees().getClass().getName());
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());
	}

}
