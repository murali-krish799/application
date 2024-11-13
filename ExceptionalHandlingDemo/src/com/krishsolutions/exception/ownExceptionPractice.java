package com.krishsolutions.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ownExceptionPractice {
	// entry point of jvm
	public static void main(String[] args) throws CustomException {
		ownExceptionPractice ownException = new ownExceptionPractice();
		List<String> items = ownException.addItems();

		String exceptionOccuredOrNot = exceptionOccuredOrNot(items, "sorry we are unable to provide your items");

		System.out.println("items :" + exceptionOccuredOrNot);
	}

	public List<String> addItems() {
		List<String> items = new ArrayList<>();

		items.add("cricket bat");
		items.add("gloves");
		items.add("wickets");
		items.add("ball");
		items.add("toss delay due to rain");
		return items;
	}

	public static String exceptionOccuredOrNot(List<String> items, String exceptionData) throws CustomException {

		List<String> localItems = new ArrayList<>();
		localItems.add("cricket bat");
		localItems.add("gloves");
		localItems.add("wickets");
		localItems.add("ball");
		localItems.add("toss delay due to rain");
List<String>ListOfAvailableItems= new ArrayList<>();
		for (String localItem : localItems) {

			for (String item : items) {

				if (item.contains(localItem)) {
					ListOfAvailableItems.add("your " + item + " is available here");
					System.out.println("available item here is "+localItem);
				}

			}

		}
		return ListOfAvailableItems.toString();

	}
}
