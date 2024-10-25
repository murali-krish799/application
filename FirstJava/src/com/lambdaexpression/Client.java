package com.lambdaexpression;

import java.lang.annotation.Annotation;


public interface Client {

	public static void main(String[] args) {
	
	
//	anonymous method why because we are 
//	going to provide fully implementation here
//	FunctinalInterfaceDemo functiondemo
//	= new FunctinalInterfaceDemo() {
//
//		@Override
//		public String abstractMethodDemo() {
//			
//			
//			
//			
//			return "this is normal way of calling functional interface methods";
//		}
//		
//		
//	};
////	data type of string 
//	String abstractMethodDemo = functiondemo.abstractMethodDemo();
//	System.out.println("thisnis inteface of method value :"+abstractMethodDemo);
//	// lambda expression formula is 
////	(paramthsisses)->{body};
//	
//	FunctinalInterfaceDemo functionalDemo=()->{
//		System.out.println("this is business logic of "
//				+ "functional interface ofabstract method data");
//		
//	return "this is functional interfacedemo of abstract method data";
//	
//	};
//	String abstractMethod= functionalDemo.abstractMethodDemo();
//	
//	System.out.println("this is abstractMethodDemo "+abstractMethod);
//	System.out.println("***********");
//	FunctinalInterfaceDemo2 functionalDemo2=()->  "this is functional interfacedemo of abstract method data";
//		
//		
//	
//	String abstractMethodDemo2 = functionalDemo2.abstractMethodDemo();
//	
//	System.out.println("this is abstractMethod of 2 "+abstractMethodDemo2);
//	
	
		// lambda expression formula is 
//	(paramthsisses)->{body};
	
//		 FunctionalInterfaceDemo functionalInterfaceDemo=(String data)->{
//		
//		
//		return"this is return of one perameterizedconsttructor data "+data;
//		
//		 };
//	
//		
//		String abstractMethodDemo = functionalInterfaceDemo.abstractMethodDemo("we are learning lambda expressions right now..");
//	
//		
//		System.out.println(abstractMethodDemo);
//
//		System.out.println("*********");
//	
//		FunctionalInterfaceDemo functionalInterfaceDemo2=
//	data->"this is return of one perameterizedconsttructor data "+data;
//			
//			String abstractMethodDemo2 = functionalInterfaceDemo2.abstractMethodDemo("we are learning lambda expressions right now..");
//		
//			
//			System.out.println(abstractMethodDemo2);
	
		// lambda expression formula is 
//		(paramthsisses)->{body};
	
		FunctionalInterfaceDemo functionalInterfaceDemo
		=( data, value)->"this is two parameterized constructor of "
				+ "functioaninterfaceDemo "+data +" "+value;
		String abstractMethodDemo = functionalInterfaceDemo.abstractMethodDemo("lambda expression almost learn and rating is",6);
		
		
		System.out.println(abstractMethodDemo);
	}
//	(string data) optiona  data->
//	 single parameterized constructor is optional parathsis
	
//	(String data,int value) ->isn't optional
//	double parameterized constructor is mandatory for parathasis
//	()-> isn't optional
//	no parameterized constructor is mandatory for parathasis
}
