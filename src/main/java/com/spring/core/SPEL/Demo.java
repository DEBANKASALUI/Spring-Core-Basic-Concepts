package com.spring.core.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

//	Primitive type Expressions through SPEL
	@Value("#{22+33}")
	private int x;

//	Primitive type Expressions through SPEL
	@Value("#{5+5+60+30}")
	private int y;

//	calling Static Methods through SPEL
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;

//	calling Static Variables through SPEL
	@Value("#{T(java.lang.Math).PI}")
	private double e;

//	calling Objects through SPEL
	@Value("#{new java.lang.String('Harry Potter')}")
	private String name;

//	Boolean expression with SPEL
	@Value("#{8-4>3}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
