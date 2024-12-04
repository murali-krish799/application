package com.krishsolutions.collections;

import java.util.Stack;

/**
 * demonstrate of stack class it is from list interface of collection framework
 */
public class StackDemo {

	public static void main(String[] args) {
		
		//initial capacity 10
//		 increment 100%
//		vector is a parent class
//		stack is a child class
		Stack<String> stack= new Stack<>();
			
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("8");
		stack.push("9");
		stack.push("10");
		stack.push("11");
		stack.push("12");
		stack.push("13");//add
		System.out.println(stack);
		System.out.println(stack.pop());//remove top one
		System.out.println(stack);
		System.out.println(stack.peek());//showing top one
		
		
		}
}
