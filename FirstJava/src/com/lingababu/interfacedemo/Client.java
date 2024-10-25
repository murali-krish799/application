package com.lingababu.interfacedemo;

public class Client {
	public static void main(String[] args) {
		
		
		InterfaceDemo intefaceDemo= new InterfaceDemo() {
			
			@Override
			public String doPayment() {
				// TODO Auto-generated method stub
				return "this is depayment method from interfaceDemo";
			}
		};
		
		System.out.println(intefaceDemo.doPayment());
	}

}
