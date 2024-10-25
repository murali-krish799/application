package com.lingababu.lambdaexpression;

public class FirstMethodDemo {
	// first method-> return some value
//here return some value
	public float returnValueDemo() {
		return 22.8f;
	}
//	second method->return some Boolean

	
	public boolean returnBooleanValueDemo() {
		
		return false;
	}
//	third method-> give data(user credentials) and return data(amount or whatever you expecting that can you getting)

	
	public String giveValueAndReturnValueDemo(String username) {
	
//		do some business logic here
		return"this is client given username  : "+username;
	}
//		/fourth method-> take value but don't won't return anything
		public void takeSomeValueWontReturnValue(int amount) {
			
			System.out.println("this amount will store inside of database or account "+amount);
			
		}
		
		
	}
