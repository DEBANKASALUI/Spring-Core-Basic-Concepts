package com.spring.core.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
//	reference variable level annotation
	@Autowired
	@Qualifier("tempaddress")
	private Address address;

	public Address getAddress() {
		return address;
	}

//	Setter level Annotation
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside Setter");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	Constructor level Annotation
	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Inside Constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
