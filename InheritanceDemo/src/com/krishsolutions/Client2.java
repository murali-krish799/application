package com.krishsolutions;

import com.krishsolutions.inheritance1.FirstInterface;
import com.krishsolutions.inheritance1.Guest2;
import com.krishsolutions.inheritance1.SecondInterface;

/**multiple inheritance demonstrate here
 * 
 */
public class Client2  {

	public static void main(String[] args) {

		Guest2 guest2= new Guest2();
		guest2.test();
		String returnName = guest2.testString("kris");
		
		System.out.println(returnName);
		
		System.out.println("****");
		
		boolean ifCondition = Guest2.ifCondition("k");
		System.out.println(ifCondition);
	}

	

}
