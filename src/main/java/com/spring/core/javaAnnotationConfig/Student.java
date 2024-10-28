package com.spring.core.javaAnnotationConfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {

	public void study() {
		this.samosa.display();
		System.out.println("Student is studying...");
	}

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

}
