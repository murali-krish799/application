package com.krishsolutions.inheritance;

public interface FirstInterface {

	public void test();
	
	default void demo() {
		
		System.out.println("this is demo from firstInterface ");
	}
}
