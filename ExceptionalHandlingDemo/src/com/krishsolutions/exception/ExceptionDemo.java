package com.krishsolutions.exception;

public class ExceptionDemo {
//entry point of jvm
	public static void main(String[] args) {

		ExceptionDemo.test(10, 0);
		ExceptionDemo.test2();

//default constructor
//		ExceptionDemo exDemo = new ExceptionDemo();
//
//		exDemo.ExceptionPractice();

	}

	/*
	 * exception lists 1.exception name 2.exception message 3.exception line number
	 * 4.exception methods
	 */

//static or non static
	public void ExceptionPractice() {
		System.out.println("execution start from here");
//non static variables
//	exception blocks are :
		/*
		 * 1.try ->find the exception here 2.catch ->catch the exception and some
		 * business logic 3.finally->mandatory to execute some indeed code
		 */

		int i = 10;// 10/0
		int k = 0;
		int result = i / k;// error
		System.out.println(result);// 5
		System.out.println("execution ends from here");
	}

	public static void test(int i, int k) {

		try {
			int result = i / k;
			System.out.println("result of test method : " + result);
		} catch (ArithmeticException exception) {

			System.out.println("exception :" + exception.toString());

		}

	}

	public static  void test2() {
		System.out.println("test2 mwethod....");
	}
}
