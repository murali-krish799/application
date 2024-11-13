package com.krishsolutions.exception;

import java.util.ArrayList;
import java.util.List;

public class ownException {
//	entry point of jvm
	public static void main(String[] args) throws CustomException {
		ownException ownException = new ownException();
		List<String> items = ownException.addItems();

		String exceptionOccuredOrNot = exceptionOccuredOrNot(items,"sorry we are unable to provide your items");

		System.out.println("items :"+exceptionOccuredOrNot);
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

	public static String exceptionOccuredOrNot(List<String> items,String exceptionData)throws CustomException {

//		            single item    //list of items
		System.out.println("this is available items");
		for (String item : items) {

			if (item.contains("cricket bat")) {

				System.out.println("cricket bat available");
			}
			if (item.contains("gloves")) {

				System.out.println("gloves available");
			}
			if (item.contains("wickets")) {

				System.out.println("wickets available");
			}
			if (item.contains("ball")) {

				System.out.println("ball available");
			}
			if (item.contains("coin for toss")) {

				System.out.println("coin for toss available");
			}

		}
		int i = 0;
		String[] things = new String[items.size()];
		for (String thing : items) {

			things[i] = thing;
			i++;
		}

		if (things[0].equals("cricket bat") && things[1].equals("gloves") && things[2].equals("wickets")
				&& things[3].equals("ball") && things[4].equals("coin for toss")) {

			return "your all items :" + items.toString() + "\n ready and packed your iteams ..thanks for coming ";

		}
		else {
			
			 throw new CustomException(exceptionData); 		
		}

	}
}
