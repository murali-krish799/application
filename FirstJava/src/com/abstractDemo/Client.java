package com.abstractDemo;

public class Client {
	public static void main(String[] args) {
		SbiBankClinet sbiBankClinet= new SbiBankClinet();
//		 this is from sbibankClient
		sbiBankClinet.withdrawAmount();
//		abstract class method
		sbiBankClinet.debitcard();
		
//		 own method
		sbiBankClinet.testmethod();
		System.out.println("*****************");
		
		Axisbank axisbank= new Axisbank();
		
		axisbank.withdrawAmount();
		axisbank.debitcard();
	}

}
