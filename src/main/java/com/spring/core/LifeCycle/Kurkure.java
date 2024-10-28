package com.spring.core.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kurkure {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Kurkure() {
		super();
	}

	@Override
	public String toString() {
		return "Kurkure [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Kurkure: init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending Kurkure: destroy");
	}
	
}
