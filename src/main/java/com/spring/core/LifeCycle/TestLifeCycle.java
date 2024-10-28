package com.spring.core.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/LifeCycle/config.xml");
		Samosa s1 = (Samosa) context.getBean("samosa");
		System.out.println(s1);
//		registering shutdown hook for calling destroy method
		context.registerShutdownHook();

		Pepsi p = (Pepsi) context.getBean("pepsi");
		System.out.println(p);
		
		Kurkure k=(Kurkure)context.getBean("kur");
		System.out.println(k);
	}

}
