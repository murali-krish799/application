package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSumOfEvenNumbers {
	public static void main(String[] args) {

//		CollectionsDemo cd= new CollectionsDemo();
		/*
		 * initial value is zero size of array is 10 50% increment
		 */

		List<Integer> list = new ArrayList<>();

		list.addAll(Arrays.asList(4, 5, 0, 9, 8, 10));

		int sum=0;
		for(int i:list) {
			
			if(i%2==0) {
				
				sum+=i;
			}
			
		}
		
		System.out.println("sum of total list :"+sum);
	
		System.out.println("average of total list :"+sum/list.size());
		
	}

}
