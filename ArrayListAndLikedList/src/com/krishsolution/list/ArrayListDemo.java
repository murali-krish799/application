package com.krishsolution.list;

import java.util.ArrayList;

//this is implementation clas of list interface
public class ArrayListDemo {
	public static void main(String[] args) {
//		linga babu->classcast exception
		
		
		ArrayList<String>test= new ArrayList<>();
		                        //index
		test.add("linga bab-1");//-0
	
		test.add("linga babu-2");//-2
		test.add("linga babu-3");//-3
		test.add("linga babu-4");//-4
		test.add("linga babu-5");//-5
		test.add("linga babu-6");//-6
		test.add("linga babu-7");//-7
		test.add("linga babu-8");//-8
		test.add("linga babu-9");//-9
		test.add("linga babu-10");//-10
		test.add("linga babu-11");//-11
		System.out.println("*****");
		
		
		
		String string = test.get(1);
		
		System.out.println(string);
		test.add(1,"murali-12");//-1
		String string2 = test.get(1);
		
		System.out.println(string2);
		//cross the limit of capacity of arraylist
		//will be increased to 50%
		
	}

}
