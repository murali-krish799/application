package com.krishsolutions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * demonstrate of vector class it is from list interface of collection framework
 */
public class VectorDemo {

	public static void main(String[] args) {
		//10
		//10+10=20=20
		//40
		Vector<String> vector = new Vector<>();

		vector.add("second");
		vector.add("third");
		vector.add("fourth");
		vector.add("fiveth");
		vector.add("six");
		vector.add("seven");
		vector.add("fourth");
		vector.add("fiveth");
		vector.add("eight");
		vector.add("nine");
		vector.add("ten");
		vector.add("10");
		vector.add("second");
		vector.add("ten");
		vector.add("10");
		vector.add("second");
		
		
//		System.out.println(vector);
//		vector.clear();
//		System.out.println(vector);
		List<String> asList = Arrays.asList("murali","linga babu","java");
		vector.addAll(asList);
		System.out.println(vector);
		
		vector.addFirst("first element");
			vector.addLast("last one ");
			System.out.println(vector);
			int capacity = vector.capacity();
			System.out.println(capacity);
			int size = vector.size();
			System.out.println(size);
			
			boolean contains = vector.contains("linga babu");
			
			System.out.println(contains);
			String string = vector.get(vector.size()-1);
			
			System.out.println(string);
			int indexOf = vector.indexOf("linga babu");
			System.out.println(indexOf);
			
			//vector is a synchronized
			
	}
}
