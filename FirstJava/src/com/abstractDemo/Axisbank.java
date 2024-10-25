package com.abstractDemo;

public  class Axisbank extends AbstractionDemo {

	
	@Override
	public void withdrawAmount() {
		System.out.println("this is axisbank implementation of withdrawAmount()method ");
	}
    //hide methods 
	@Override
	public void debitcard() {
		System.out.println("this is debit card of axis bank classs own implementation..");
	}
}
