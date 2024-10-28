package com.spring.core.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/stereotypeAnnotations/stereoconfig.xml");

		/*
		 * If name specified in Component Annotation in Student class it will throw
		 * NoSuchBeanDefinitionException if we use Class name in camel case in context.getBean(); 
		 * If no name specified IOC container will create object as per class name in Camel case.
		 * 
		 * By Default Spring Container provides bean scope as Singleton-object created
		 * only once, and same object returned as many times when required,hashcode same. 
		 * We can change the scope by using @Scope Annotation with @Component
		 * Annotation to change bean scope to Prototype- every time new object is
		 * created when called, object hashcodes are not same.
		 */

//		Student stu=context.getBean("student",Student.class);

		Student stu = context.getBean("ob", Student.class);

		System.out.println(stu);
		System.out.println(stu.getAddress());
		System.out.println(stu.getAddress().getClass().getName());
		
		//by @Scope Annotation
		System.out.println(stu.hashCode());

		Student stu1 = context.getBean("ob", Student.class);

		System.out.println(stu1.hashCode());
		
		//by XML scope attribute
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher1.hashCode());
		
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher2.hashCode());
	}

}
