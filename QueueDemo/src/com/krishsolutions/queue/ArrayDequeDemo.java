package com.krishsolutions.queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeDemo {
	public static void main(String[] args) {

		// 16[][][][][]-fifo
		ArrayDeque<String> ad = new ArrayDeque<>();
		// head-0-begining index
//		tail->ending index-0+1+2+3
		ad.add("linga babu");// fifo priority -01
		ad.add("murali");
		ad.add("pennam");
		ad.add("pushpa");
		ad.add("pushpa-2");// [][]][]
//poll-arraydeque -remove-common

		ad.addAll(Arrays.asList("first", "second", "third"));
		ad.addFirst("first-1");
		ad.addLast("last-1");
		System.out.println("**");
//	ad.clear();
		String first = ad.getFirst();
		System.out.println("get first element " + first);
		boolean empty = ad.isEmpty();
		System.out.println(empty);
	}
}
