package com.krishsolutions.exception;

public class StaticDemoinheritance extends StaticDemo{

	
	@Override
	public void test2() {
		System.out.println("here calling super class method of test..");
		super.test2();
	}
	
	
	public static void main(String[] args) {
		StaticDemoinheritance staticDemoinheritance= new StaticDemoinheritance();
		
		staticDemoinheritance.test2();
		staticDemoinheritance.test();
	}
}
