package com.krishsolutions;
/*
 * we are going to demonstrate scanner
 * it will take input from user
 */

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args)  {
		scannerDemo();
	}

	public static void scannerDemo()  {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("please give me your details to us..");
			while (true) {
				String details = scanner.nextLine();
				System.out.println("what is your name...?");
				String name = scanner.nextLine();
				System.out.printf("Hi mister  %s , how are you %n", name);
				System.out.println("what is your age..? ");

				int age = scanner.nextInt();

				if (age > 10 && age < 15) {

					System.out.println("you are eligible for participate..");
					System.out.println("thank you are being here....");

				} else {
					throw new Exception("you are not eligible for this contistant...");
				}


			}
		} catch (Exception e) {
			System.out.println("sorry for inconvenience caused .. "+e.getMessage());
		}
	}
}