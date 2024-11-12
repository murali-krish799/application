package com.krishsolutions.exception;

public class StaticDemo {
//	static methods can't override from anywhere
//	if we want then take to use direct class name
	public static void test() {
		demo2();
		
		System.out.println("this is static demo of test method");
	}
	
	public void test2() {
		demo();
		demo2();
		System.out.println("this is test2 method of staticDemo class");
	}
	
	private void demo() {
		
		System.out.println("this is private method demo");
	}
	private static void demo2() {
		System.out.println("this is private method demo2");
	}
	

}
