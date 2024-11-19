package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindListOfCommonElements {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(12, 2, 22, 33, 44));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 12, 22, 2,2,2, 33, 4));
		List<Integer> sameElements = new ArrayList<>();
		for (int n : list1) {

			for (int n2 : list2) {
				if (n == n2) {
					if (!sameElements.contains(n)) {
						sameElements.add(n);

					}
				}
			}
		}
System.out.println("find same element :"+sameElements);
	}
}
