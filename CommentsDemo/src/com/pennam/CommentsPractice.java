package com.pennam;

import java.util.Arrays;
import java.util.List;

/**
 * who create class what is version of when create class what type of versions
 * are going to update
 * 
 */

//oops 
//collections
//stream api
//lambda expressions
//string buffer
//string builder
//this is for recursive strategy for all developers-updated
public class CommentsPractice {

//	 first comment is forward slashes like//

//this is for creditcardDemo business logic written by linga babu if you have any issue do ask him
	/*
	 * this is for creditcardDemo business logic written by linga babu if you have
	 * any issue do ask him this is second comment this is written by me
	 */

	public static void creditCardDemo() {
		List<Integer> numbers = Arrays.asList(12, 34, 45, 66, 6, 6);
		System.out.println("we are trying to prove lambda expression..");
		MaxFinder maxFinder =
				// lambda expression
				() -> numbers.stream().max(Integer::compare).orElse(null);

		// return someone
		Integer maxValue = maxFinder.getSomeValue();

		System.out.println("getting some value fom stream max " + maxValue);
//	System.out.println("don't care about business logic");
//	System.out.println("this is another code");

	}

	public static void main(String[] args) {
//		CommentsPractice.creditCardDemo();
		CommentsPractice.creditCardDemo();

		String name = " linga ";

		name.concat("java          ");
	}
}