package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndexofElement {
	public static void main(String[] args) throws Exception {

Integer indexNumber = findIndexNumber(1);
System.out.println(indexNumber);
		
	
	}
	
	public static Integer findIndexNumber(int num) throws Exception {
		List<Integer>intNum= new ArrayList<>(Arrays.asList(12,2,23,44,45,55));
		//11
		for(int n:intNum) {
			
			if(n==num) {
				
				return intNum.indexOf(n);
			}
		}
		throw new Exception("given number doesn't have in list sorry..");
		
	}
			
}
