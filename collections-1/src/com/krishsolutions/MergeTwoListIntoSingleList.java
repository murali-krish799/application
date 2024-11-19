package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoListIntoSingleList {
	public static void main(String[] args) {

//		CollectionsDemo cd= new CollectionsDemo();
		/*
		 * initial value is zero size of array is 10 50% increment
		 */

		List<Integer> list1 = new ArrayList<>();

		list1.addAll(Arrays.asList(4, 9, 8));
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList( 5,0,10));
		List<Integer> mergeList = new ArrayList<>(list1);
		mergeList.addAll(list2);
	
	System.out.println("print two lists of convert into one list :"+mergeList);
	}

}
