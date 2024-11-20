package com.krishsolutions.queue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

/**collection interface
 * set ,list ,queue
 * queue -> priority , arrayDeque , linkedList it is implements  deque,queue,List interface
 * 
 */
public class QueueDemo {
public static void main(String[] args) {
	//default value is 11
	PriorityQueue<Integer> queue= new PriorityQueue<>();
	
	queue.add(1);
	queue.add(2);
	queue.add(3);
	queue.add(4);
	queue.add(5);
	System.out.println(queue);
	
	System.out.println(queue.peek());
	System.out.println(queue.peek());
	System.out.println(queue.poll());
	
	College c= new College();
	System.out.println(c);
	Map<String,String>map= new HashMap<>();
	
	System.out.println(map);
	map.put("1", "data");
	String put = map.put("1", "first data added");
	System.out.println("data happend : "+put);
	map.put("3", null);
	map.put("4", null);
	System.out.println(map);
	
	LinkedList<String>name= new LinkedList<>();
	System.out.println("linkedlist :"+name);
	ArrayDeque<Integer> dq= new ArrayDeque<>();
	
	dq.addLast(12);
	
}
}
