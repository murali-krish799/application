package com.krishsolutions.defaultdemo;

public class Client {
	public static void main(String[] args) {
		ConstructorDemo constructorDemo = new ConstructorDemo();
		int i = constructorDemo.i;
		System.out.println("this is default constructor value of i "+i);
	
	ConstructorDemo constructorDemo2 = new ConstructorDemo(10);
	
	System.out.println("this is explicit constructor value "+constructorDemo2.i);
	}

}
