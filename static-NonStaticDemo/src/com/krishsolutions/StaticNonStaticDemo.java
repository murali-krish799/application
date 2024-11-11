package com.krishsolutions;

/**
 * @author demonstrate of static and non static blocks,variables,methods .java
 *         file convert into .class file then go class loader system management
 *         class loaders are: boostrap class loader extension class loader
 *         application class loader
 * 
 *         linkins are verify prepare resolve intiliaze : initialization memory
 *         management system: stack ->variables or instance are storing purpose
 *         heap - this is for non static fields storing purpose method area this
 *         is for static fields storing purpose
 * 
 */
public class StaticNonStaticDemo {
	static int number;

	static {
		System.out.println("this is static block..execute first");
	number=100;
	System.out.println("number value "+number);
	}
	{
		System.out.println("execute second n number times object creates");
	System.out.println("number value "+number);
	}

	public StaticNonStaticDemo() {
		System.out.println("after default block executes and while objects creates time..");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		new StaticNonStaticDemo();
		new StaticNonStaticDemo();
		new StaticNonStaticDemo();
		new StaticNonStaticDemo();
		System.out.println("this is static method");
		staticTest();//
		new StaticNonStaticDemo();
	}

	//static method
	//	static method can't access non static methods or variables without create an object
	public static void staticTest() {

		System.out.println("this is static staticTest method");
	new StaticNonStaticDemo().test();//non static access once object was created
	}

	//	non static method
	//	can access static variables and methods without creation objects
	public void test() {
		System.out.println("this is non static method");
//	staticTest();//static method access here
	}

}
