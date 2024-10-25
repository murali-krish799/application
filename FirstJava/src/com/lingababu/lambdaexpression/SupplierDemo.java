package com.lingababu.lambdaexpression;

import java.util.function.Supplier;

public class SupplierDemo {
//	
//	first method-> return some value

	public static void main(String[] args) {
		
		
		Supplier<String>supplierDemo= new Supplier<String>() {
			
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "i am a manager i want to see all sbi cumstomer accounts";
			}
		};
		
		String returnValue = supplierDemo.get();
		
		
		System.out.println("return entire value fro =m get method supplier fiunctionalInterface "+returnValue);
	
	System.out.println("do write lambda expression");
	
	Supplier<String>supplierDemo2= 
		
		()-> "i am a manager i want to see all sbi cumstomer accounts";
		
	
	String returnValue2 = supplierDemo2.get();
	
	System.out.println(returnValue2);
	}

}
