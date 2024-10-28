package com.spring.core.SpringCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<Integer> phone;
	private Set<String> address;
	private Map<String,Double> courses;
	private Properties property;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhone() {
		return phone;
	}
	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, Double> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Double> courses) {
		this.courses = courses;
	}
	
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	public Employee() {
		super();
	}
	public Employee(String name, List<Integer> phone, Set<String> address, Map<String, Double> courses,
			Properties property) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
		this.property = property;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", address=" + address + ", courses=" + courses
				+ ", property=" + property + "]";
	}
	
}
