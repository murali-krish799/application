package com.krishsolutions.defaultdemo;

import com.krishsolutions.ConstructorPractice;

public class Client {
	public static void main(String[] args) {

		ConstructorPractice constructorPractice = new ConstructorPractice(30);

		int i = constructorPractice.i;

		System.out.println("this is variable value " + i);
	}

}
