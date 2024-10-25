package com.lingababu.lambdaexpression;

import java.util.function.Predicate;

public class PredicateDemo {
	
//	second method->return some Boolean
	
	public static void main(String[] args) {
		
	
	
	Predicate<String> predicateDemo=new Predicate<String>() {

		@Override
		public boolean test(String password) {
//			whether true or false
			if(password==("linga123")) {
				
				return true;
			}else {
				System.out.println("your password was wrong");
				return false;
			}
		}
	};
	
	
	boolean test = predicateDemo.test("linga123");
	System.out.println("the password is correct or wrong "+test);
	System.out.println("this is lambda expression");

	
	
	Predicate<String> predicateDemo2=

		 (password) ->{
//			whether true or false
			if(password==("linga123")) {
				
				return true;
			}else {
				System.out.println("your password was wrong");
				return false;
			}
		};
		
//	true or false
		boolean test2 = predicateDemo2.test("jfhejfh");
		System.out.println("this is wrong password "+test2);
	}	
}
