package com.krishsolutions.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * we are demonstrating about queue interface it is implementation of three
 * classes those are: prioityQueue ArrayDequeue linkedlist coming from list
 * interface also
 * 
 */
public class QueueDemo {

	public static void main(String[] args) {
		// parent-interface child means implementation classes
		PriorityQueue<Integer> queue = new PriorityQueue<>();// 11
		// inserting order
		queue.add(3);// 3 b
		queue.add(5);// 2 c
		queue.add(0);// 1 a fifo
		System.out.println(queue);

//		queue.remove();//top element remove

//		System.out.println(queue.peek());//top element can see here

		System.out.println(queue.poll());// remove

		System.out.println(queue);
	}

}
