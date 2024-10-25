package com.krishsolutions;

import com.lingababu.DemoOFDefault;

//demoofdefault that class so  in this class have all methods are involved
//right now we are forcefully extends with  firstJava1
public class FirstJava1 extends DemoOFDefault {

//	A is a parent class and have lot of methods
//	extends keyword
//	B is a child class and have no methods

	public static void main(String[] args) {

//		SecondJava secondjava= new SecondJava();
//		
////		secondjava.test();
////		secondjava.welcome();//public
//		
////		protected
//		
//		secondjava.demo();
//		secondjava.demo();// defualt method...

		System.out.println("hello world program..001100111");

		DemoOFDefault demoOFDefault = new DemoOFDefault();
//		public method 
		demoOFDefault.welcomePublic();

//		right now private
//		demoOFDefault.welcomeToPrivate();

		FirstJava1 firstJava1 = new FirstJava1();

		firstJava1.welcomeToProtected();
	}

}
