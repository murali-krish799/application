package com.krishsolutions.loops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

/**
 * enumeration is a interface it is run loop for legacy classes only that is
 * java version of 1.0 only those are
 * vector,stack,hashtable,dictionary,properties
 * 
 */
public class EnumerationDemo {

	public static void main(String[] args) throws IOException {
	
		
		//hashtable
		Hashtable<String,Integer>map= new Hashtable<>();
		
		
		map.put("a", 12);
		map.put("b", 13);
		map.put("c", 14);
		map.put("d", 15);
		map.put("e", 16);
//		read only and forward direction
		Enumeration<Integer> elements = map.elements();
//		value will print here
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
				
		}
		
		Vector<String>vec= new Vector<>();
		
		vec.add("pennam");
		vec.add("krish");
		vec.add("murali");
		vec.add("ruhii");
		Enumeration<String> elements2 = vec.elements();	
	while (elements2.hasMoreElements()) {
		String returnValue =  elements2.nextElement();
		System.out.println(returnValue);
	
	}
	
	
	Stack<String>stack= new Stack<>();
	stack.push("krish");
	stack.push("a");
	stack.push("b");
	stack.push("c");
	System.out.println(stack);
	String pop = stack.pop();
	System.out.println(pop);
	System.out.println(stack);
	}
}
