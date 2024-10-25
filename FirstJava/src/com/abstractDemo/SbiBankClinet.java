package com.abstractDemo;

public class SbiBankClinet extends AbstractionDemo  {

	@Override
	public void withdrawAmount() {
		System.out.println("this is own implementation of sbi class of method sbi bank");
	}

//	hide methods 
//	is it mandatory..?
//	@Override
	public void debitcardssssdds() {
		System.out.println("print own logic of sbi class of debit card");
	}
	
	public void testmethod() {
		
		System.out.println("own of method of abstract class testmethod() ");
	}
	
	
	void demo() {
		
		System.out.println("this is by default default..");
	}
}
