package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CreateArrayFromListAndPrint {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 2, 3, 44, 55, 5, 5));
CreateArrayFromListAndPrint n= new CreateArrayFromListAndPrint();
n.toString();
		
		Object[] array = list.toArray();
		Integer [] numArray=new Integer[array.length];
		int i=0;
		for(Object number:array) {
			
			numArray[i]=(Integer)number;
			
			i++;
		}
		System.out.println();
		System.out.println("array list here :"+Arrays.toString(numArray));
	
	
	}
}
