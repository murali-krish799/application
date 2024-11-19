package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DeleteDuplicateFromList {
	public static void main(String[] args) {

		
		List<Integer> listsNum=Arrays.asList(112,22,55,55,55,34,45,45);
		List<Integer>list= new ArrayList<>(listsNum);
		List<Integer>nonDuplicate= new ArrayList<>();
		
		for (Integer number : list) {
			if(!nonDuplicate.contains(number)) {
				
				nonDuplicate.add(number);
			}
			
		}
		System.out.println(nonDuplicate);
		
		
	}
}
