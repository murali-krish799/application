package com.krishsolutions.abstraction;

/**abstraction 
 * it is process of hiding implementation details and showing only functionality 
 * to the user
 * 
 */
public class AbstractionDemo {
	public static void main(String[] args) {
//this is hiding interface of all abstraction implementation methods 
		AbstractionInterface abInterface=new AbstractionClass();
		abInterface.demo();
		abInterface.test();
		
	}
}
