package com.krishsolutions.defaultdemo;

public class ConstructorDemo {
	public int i;

	public ConstructorDemo() {

		System.out.println("default constructor..");
		this.i=30;
	}

	public ConstructorDemo(int i) {
		System.out.println("explicit parameterized constructor ");
		this.i = i;
	}

}
