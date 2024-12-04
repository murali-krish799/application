package com.krishsolutions;

public class StringBufferDemo {
	public static void main(String[] args) {
		// initial capacity 16
		StringBuffer sb = new StringBuffer("murali");
		System.out.println(sb.capacity());
		StringBuffer sb2 = new StringBuffer("murali");
		System.out.println(sb == sb2);

		System.out.println(sb.equals(sb2));
		System.out.println(sb.compareTo(sb2));

	}
}
