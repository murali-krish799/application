package com.lingababu.lambdaexpression;

public class Client {
	public static void main(String[] args) {
		FirstMethodDemo firstMethodDemo= new FirstMethodDemo();
		
//		System.out.println(firstMethodDemo.hashCode());
		
		float returnValueDemo = firstMethodDemo.returnValueDemo();
		System.out.println(returnValueDemo);
		
		
		System.out.println("*********");
		//false
		boolean returnBooleanValueDemo = firstMethodDemo.returnBooleanValueDemo();
	System.out.println(returnBooleanValueDemo);
	
	System.out.println("***");
	
	String giveValueAndReturnValueDemo = firstMethodDemo.giveValueAndReturnValueDemo("lingababu password and uisername..");
	
	System.out.println(giveValueAndReturnValueDemo);
	
	System.out.println("***");
	
	
	firstMethodDemo.takeSomeValueWontReturnValue(2324424);
	}

}
