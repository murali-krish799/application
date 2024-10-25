package com.krishsolutions;

//access modifiers
// public:-access all classes

// protected:- access same package and another package with help of extends this class
//  private:- same class can access private class as well methods
//  default:-same package only can access



public  class SecondJava {
// javac firstjava.java
//	java firstJava
//	java -jar firstAJava.jar by using tomcat or jboss or jetty server port number 8080/8087/8088
	//operations
	
	
	
	private void test() {
		
		System.out.println("this is private test method...");
	}
	
	
	public void welcome() {
		
		test();//private method
		
	}
	
//	access modifier of protected is used to same package
	protected void demo() {// protected method
		
		System.out.println("this is protected method..");
	}
	
//	with out providing any access modifiers is called default method...
	 void demo2() {
		
		System.out.println("this is demo2 method of default access modifer..");
	}
	
	public static void main(String[] args) {
		System.out.println("second java ....");
	}
	
	
	
}
