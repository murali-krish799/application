package com.krishsolutions.defaultdemo;

public class Client {
	public static void main(String[] args) {

		ConstructorDemo constructorPractice = new ConstructorDemo(30);

 int i = constructorPractice.i;
		  System.out.println("this is variable value " + i);
		   
		 
	}
	
	public void newMethod() {
		
		System.out.println("this is new method ");
	}

}
