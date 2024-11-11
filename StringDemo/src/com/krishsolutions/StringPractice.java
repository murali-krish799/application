package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author demonstrate of string it is a class in java string is a literal
 *         because it is unique behavior String is immutable
 */
public class StringPractice {
	public static void main(String[] args) {
		stringTest();
	}

	public static void stringTest() {

		String n = "murali";// store in string constant pool
		String n2 = "murali";//store in string constant pool
		String n3 = new String("murali");//store in heap memory
		

		System.out.println(n == n2);//true -> find the memory address
		System.out.println(n == n3);//false -> find the memory address
		System.out.println(n.equals(n3));//true find the content
		char[] charArray = n.toCharArray();
		List<Character>character=new ArrayList<>();
		for(char r:charArray) {
			
			character.add(r);
		}
		character.forEach(System.out::println);
		
		System.out.println();
		System.out.println(n.toUpperCase());
		
	}

}
