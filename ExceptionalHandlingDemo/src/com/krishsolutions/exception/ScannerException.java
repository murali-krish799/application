package com.krishsolutions.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerException {

	public static void main(String[] args) throws CustomException {
		System.out.println("available items are below...");

		 ExceptionScanner();
		
	}

	public static void ExceptionScanner() throws CustomException {
        List<String>items= new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {

			while(true) {
				System.out.println("please do enter your item..cr");

				String itemName = scanner.nextLine();

				switch (itemName) {

				case "bat": {
					items.add("bat is available my dear customer..");
					System.out.println(items);
					break;
				}
				case "wickets": {
					items.add("wickets are available my dear customer..");
					System.out.println(items);
					break;

				}case "gloves": {
					items.add("gloves are available my dear customer..");
					System.out.println(items);
					break;


				}case "ball": {
					items.add("ball is available my dear customer..");
					System.out.println(items);
					break;

				}
				default :{
					
				throw new CustomException(itemName+" doesn't have sorry for inconvenience caused my dear customer... :)");
				}
			}
		}
	}
}}