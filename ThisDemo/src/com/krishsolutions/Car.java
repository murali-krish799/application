package com.krishsolutions;

import java.util.Arrays;

public interface Car {
	String companyName="nissan";
	public void driver();
	
	default void getDetails() {
		System.out.println(this.hashCode());
		System.out.println(Arrays.toString(this.getClass().getMethods()));
	}

}
