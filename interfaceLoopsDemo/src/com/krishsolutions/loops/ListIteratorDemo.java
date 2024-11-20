package com.krishsolutions.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * It is a listiterate interface it is only applicable for list interface
 * implementation classes only... legacy classes and list implementation classes
 * also,,, it can read and add remove modify
 */
public class ListIteratorDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));

		ListIterator<String> listIterator = list.listIterator();
		int count = 1;
		while (listIterator.hasNext()) {

			String next = listIterator.next();
			System.out.println(next);
			count++;
		}
		while (count > 0) {
//			here added all data store there parent class 
//			if you want to get then call parent instance from there only
			listIterator.add("new one" + count);
			count--;
		}
		System.out.println("*******");
		ListIterator<String> listIterator2 = list.listIterator();
		while (listIterator2.hasNext()) {
			System.out.println(listIterator2.next());

		}
		System.out.println("********");
		while(listIterator2.hasPrevious()) {
			
			System.out.println(listIterator2.previous());
		}
		
	}

}
