package com.spring.core.ConstructorInjection;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		super();
		System.out.println("Constructor: int, int");
		this.a = a;
		this.b = b;
	}

	public Addition(double a, double b) {
		super();
		System.out.println("Constructor: double, double");
		this.a = (int) a;
		this.b = (int) b;
	}

	public Addition(String a, String b) {
		super();
		System.out.println("Constructor: String, String");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public void doSum() {
		System.out.println("Value of a=" + this.a);
		System.out.println("Value of b=" + this.b);
		System.out.println("Sum is: " + (this.a + this.b));
	}

}
