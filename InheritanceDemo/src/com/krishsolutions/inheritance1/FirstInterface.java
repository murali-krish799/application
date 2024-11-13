package com.krishsolutions.inheritance1;

public interface FirstInterface {

	public void test(String interfaceName);
	
	default void demo() {
		
		System.out.println("this is demo from firstInterface ");
	}
}
