package com.funtionalInterfaceDemo;
// is it mandatory..?
@FunctionalInterface
public interface FunctionalInterfaceDemo11 {

//	abstract method
	public void functionInterfaceDemo();
////	abstract method
//	public void checkbalance();

//no of static and default and private methods
//	 the private method behave like a utility method...
	private String customername(String customerName) {
		System.out.println("this is customeranme");

		return customerName;
	}

	default void saveAcount() {

		System.out.println("this is default method..if you want to save account then provide customer name "+customername("venu"));
	}
	default void deleteAccount() {

		System.out.println("this is default method..if you want delete this acccount then provide customer name "+customername("venu"));;
	}

	public static void staticDemo() {

		System.out.println("this is static method of functional interface...");
	}

}
