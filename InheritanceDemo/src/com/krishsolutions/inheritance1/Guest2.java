package com.krishsolutions.inheritance1;

public class Guest2 implements FirstInterface, SecondInterface {

	@Override
	public void test(String interfaceName) {
		System.out.println("this is from : " + interfaceName);
		System.out.println("this is which interface method you only find it herr..");

	}

	@Override
	public void demo() {

		SecondInterface.super.demo();
	}

	public String testString(String name) {
		try {
			if (name.length() < 5) {

				throw new Exception("name length doesn't match here..");
			} else

			{
				return name;
			}

		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public static boolean ifCondition(String name) {

		if (name.contains("krish"))
			return true;

		System.out.println("this is after statement");
		return false;

	}

	public void test() {

	}

}
