package com.krishsolution.list;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedListDemo {
	
	@Override
	public int hashCode() {
		System.out.println("hashcode get called");
		return super.hashCode();
	}
	
	public static void main(String[] args) {
		LinkedList<String>linkedlist=new LinkedList<>();
		
		linkedlist.add("test-1");//previous value is null
		//next value is test-2 
		linkedlist.add("test-2");
//		memory address -111
//		previous-111
		linkedlist.add("test-22 updated");//next -222
		
		linkedlist.add("test-3");//memory address-222
		linkedlist.add("test-4");
	HashMap<LinkedListDemo, String>name= new HashMap<>();
	LinkedListDemo linkedListDemo = new LinkedListDemo();
//	linkedListDemo.test();
	linkedListDemo.demo();
	
	name.put(linkedListDemo, "value");
	
	String string = name.get(linkedListDemo);
	
	System.out.println(string);
	
	}
	
	
	public void test() {
		System.out.println("stack over flow exception");
//		test();
	}
	public void demo() {
		
		int k=10;
		for(int i=0;i<=Integer.MAX_VALUE;i++) {
			
			int []m=new int[k]; 
			System.out.println(k);
			k*=2;
			System.out.println("object got created");
		}
	}

}
