package com.krishsolution.memory;

public class StackErrorDemo {
	public static void main(String[] args) {
	StackErrorDemo sed= new StackErrorDemo();
//	StackOverflowError
	System.out.println("stack flow started");
	sed.add();
	}

	int k = 0;
	public void add() {
		System.out.println(k);
		k++;
		add();
	}
//	before increament 16819
//	increase stack area memory 
//	by using -Xss2m
//	after value -35877
}
