package com.krishsolutions;

import com.krishsolutions.inheritance1.FirstInterface;
import com.krishsolutions.inheritance1.Guest2;

public class Test {
	public static void main(String[] args) {
		FirstInterface test1= new Guest2();
		test1.test("FirstInterface");
	}

}
