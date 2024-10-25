package com.krishsolutions;

/**
 * constructor is block of code it similar to method but it doesn;t return
 * anything and constructor name same as class name doesn't return anything here
 * for class in java default constructor is there that is called implicit
 * constructor it is called when instance or object of the class created
 *to assign data dynamically for variables
 */
public class ConstructorPractice {

	public int i;

	public ConstructorPractice() {
		System.out.println("this is default constructor..");
		i = 20;

	}

//	constructor can access only public protected private only
	public ConstructorPractice(int i) {
		System.out.println("we are inside parameterizded constructor only ");
		this.i = i;
	}

}
