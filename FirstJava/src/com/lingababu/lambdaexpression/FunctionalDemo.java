package com.lingababu.lambdaexpression;

import java.util.function.Function;

public class FunctionalDemo {
//	third method-> give value and return value

	public static void main(String[] args) {

//		          Return given data
		Function<String, String> functionDemo = new Function<String, String>() {

			@Override
//			                    T         t
			public String apply(String credentials) {

				if (credentials == "linga123") {

					return "those passwords are match then you are a sbi costumer right now ";
				} else {
					return "your password was wrong sorry for inconvenience caused do provide valid password";
				}
			}
		};
		
		String validCredentials = functionDemo.apply("linga123");
		
		
		System.out.println("this is valid credentials "+validCredentials);
	
	System.out.println("do write lambda expression");
	
	Function<String, String> functionDemo2 = 
			 credentials-> {

			if (credentials == "linga123") {

				return "those passwords are match then you are a sbi costumer right now ";
			} else {
				return "your password was wrong sorry for inconvenience caused do provide valid password";
			}
		};

	String apply = functionDemo2.apply("linga12322");
	
	System.out.println("return some value "+apply);
	}
	
}
