package com.krishsolutions.exception;

public class IndexOutOFbondException {
	//                      0 1 2 3 4 5 6
private static String name="linga babu";

public static void main(String[] args) {
	ExceptionTest(name);
}
//0123456789
public static void ExceptionTest(String name) {
	
	System.out.println(name.length());
	try {
	char charAt = name.charAt(1);
	System.out.println(charAt);
	}
		
	finally {
		
		System.out.println("this is linga babu data finally  ");
		
	}
	System.out.println("this is character of name :");
	
}

}
