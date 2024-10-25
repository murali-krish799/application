package com.lingababu.interfacedemo;

public class Googlepay implements InterfaceDemo {

//	public void demoOfInterface() {
//		System.out.println("this is intefaceof client classs my own logic ");
//		
//	}
	@Override
	public String doPayment() {
		return "return google pay logic scenario";
	}

}
