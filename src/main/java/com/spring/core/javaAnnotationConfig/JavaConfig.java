package com.spring.core.javaAnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.spring.core.javaAnnotationConfig")
//need to remove @ComponentScan Annotation if not using @Component Annotation in Student
public class JavaConfig {

	@Bean
	public Samosa getSamosaBean() {
		return new Samosa();
	}

	@Bean(name = { "student", "temp" })
	public Student getStudentBean() {
		Student st = new Student(getSamosaBean());
		return st;
	}

}
