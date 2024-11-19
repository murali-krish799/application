package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitTwoLists {
	public static void main(String[] args) {

//		CollectionsDemo cd= new CollectionsDemo();
		/*
		 * initial value is zero size of array is 10 50% increment
		 */

		List<Integer> list = new ArrayList<>();

		list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int spliPoint = list.size() / 2 + list.size() % 2;

		for (int i = 0; i < list.size(); i++) {
			if (i < spliPoint) {
				list1.add(list.get(i));
			} else {

				list2.add(list.get(i));
			}

		}
		
		System.out.println(list1);
		System.out.println(list2);

	}

}
