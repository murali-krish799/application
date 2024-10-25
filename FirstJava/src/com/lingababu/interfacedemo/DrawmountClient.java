package com.lingababu.interfacedemo;

public class DrawmountClient {

	public static void main(String[] args) {

//		Googlepay googlepay = new Googlepay();
//
//		String doPayment = googlepay.doPayment();
//		
//		System.out.println("this is do payment : "+doPayment);
//		
//		PhonePay phonePay = new PhonePay();
//
//		String doPayment2 = phonePay.doPayment();
//		
//		System.out.println("this is do payment : "+doPayment2);
//		treat like a parent          subclass
		InterfaceDemo interfaceDemo= new PhonePay();
		
		String doPayment = interfaceDemo.doPayment();
		System.out.println("this is interface of do payment :"+doPayment);
		
//		interface -- done
//		 functional interface-- today
//		 mark up interface--- once entire into spring course
		
	}
}
