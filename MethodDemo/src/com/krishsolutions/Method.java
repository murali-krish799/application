package com.krishsolutions;
/*
 * method ..?
 * method is a block of code t execute program in runtime
 * methods are classified into two ways
 * instant or non static method
 * static or class method
 * method structure 
 * access modifier return type or reserved keyword of void , method name if necessary provide parameterized constructor
 *  
 */
/*
 * Different between static and non static methods and variables
 * static variables and methods can access while compile time (static memory address is unique)
 * non static variables and methods can access runtime or dynamic time(non static memory address isn't unique)
 * 
 */

public class Method {

	
//	non static method
	public void nonStaticMethod() {
		
		System.out.println("this is instant or non static method-updated  ");
	}
//	static method
	public static void staticMethod() {
		
		System.out.println("this is static method ");
	}
//	return type of non static method
	public String returntypeOfNonStaticMethod(String name) {
		
		return name;//venu
	}
//	return type of  static method
	public static String returntypeOfStaticMethod(String name) {
		
		return name;
	}
	public static void main(String[] args) {
		String returnstaticMethod = Method.returntypeOfStaticMethod("this is parameterized static method");
		System.out.println("returnstaticMethod "+returnstaticMethod);
	  
		Method.staticMethod();
		
		System.out.println("non static details");
	
		new Method().nonStaticMethod();
	
		String returnNonStaticMethod = new Method().returntypeOfNonStaticMethod("this is non static parameterized constructor");
		System.out.println("returnNonStaticMethod "+returnNonStaticMethod);
	}
}
