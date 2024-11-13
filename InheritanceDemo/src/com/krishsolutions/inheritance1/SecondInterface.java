package com.krishsolutions.inheritance1;

public interface SecondInterface {
	public void test(String interfaceName);
	default void demo() {

		System.out.println("this is demo from secondInterface ");
	}
}
