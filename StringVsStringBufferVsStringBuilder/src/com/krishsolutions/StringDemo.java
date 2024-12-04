package com.krishsolutions;
public class StringDemo {
	public static void main(String[] args) {
//		string is a immutable nature in java
//		data and state doesn't change if try to change means 
//		will create new memory address
		String name="murali";
		
		String name2= "murali";
		
		System.out.println(name==name2);
		System.out.println(name.equals(name2));
			
	}

}
