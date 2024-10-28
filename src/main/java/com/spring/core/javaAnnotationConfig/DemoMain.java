package com.spring.core.javaAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//		for @Component Annotation
//		Student stu = context.getBean("student", Student.class);

//		for @Bean Annotation
//		Student stu = context.getBean("getStudentBean", Student.class);

//		for @Bean(name= {})
		Student stu = context.getBean("student", Student.class);

		System.out.println(stu);
		stu.study();

	}

}
