package com.krishsolutions.queue;

import java.util.Arrays;
import java.util.LinkedList;

public class FindNNumberOfvaluecount {

	public static void main(String[] args) throws Exception {
		
		
		String countOfnumber = FindNNumberOfvaluecount.countOfnumber(44);
		System.out.println("find the count :"+countOfnumber);
	}
	
	public static String countOfnumber(int value) throws Exception {
		
		
		LinkedList<Integer>list= new LinkedList<>(Arrays.asList(12,2,2,33,44,44,44));
	
	if(list.contains(value)) {
		
		int count =0;
		for(int n:list) {
			if(value==n) {
				count++;
			}
		}
		
		return value +"count is :"+count;
	}else {
		
		throw new Exception("given value doesn;t have in list "+value);
	}
	
	}
}
