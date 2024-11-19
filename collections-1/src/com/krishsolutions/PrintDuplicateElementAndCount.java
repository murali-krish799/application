package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PrintDuplicateElementAndCount {
	public static void main(String[] args) {

		List<String> listOfWords = new ArrayList<>(
				Arrays.asList("pennam", "ruhi", "krish", "krish", "krish", "ruhi", "murali"));

		List<String> countElements = new CopyOnWriteArrayList<String>();
		int count =1;

		for (String name : listOfWords) {

			if (listOfWords.contains(name)) {

				
				String repeat = name + " : " + count;
				if (!countElements.contains(repeat)) {
					countElements.add(name + " : " + count);

				} else {
					
					int replace = countElements.indexOf(name + " : " + count);
					count++;
					countElements.set(replace, name + " : " + count);

				}
			}

		}
		/*
		 * List<String>repeatedWords=new ArrayList<>(); for(String
		 * addRepeated:countElements) {
		 * 
		 * if(!addRepeated.contains("1")) { repeatedWords.add(addRepeated);
		 * 
		 * } }
		 */
		for(String addRepeated:countElements) {
			
			if(addRepeated.contains("1")) {
				countElements.remove(addRepeated);
				
			}
			}
		
		System.out.println("repeated ");
		
		System.out.println("repeated words with count :"+countElements);
	}
}
