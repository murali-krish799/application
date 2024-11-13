package com.krishsolutions;

public class LoopingDemo {
	public static void main(String[] args) {
		//		initialization
		int i=200;
		//		condition
		/*
		 * while(i<10) {
		 * 
		 * System.out.println(" i value is :"+i); // post increment i++; }
		 */	

		/*
		 * do {
		 * 
		 * System.out.println("i value is :"+i); i++; }while(i<10);
		 */	

		//print even numbers from 200 to 25

		/*
		 * while(i>25) { if(i%2==0) { System.out.println("even number :"+i); } i--; }
		 */

		//print prime numbers for 0 to 200
		int number = 29; // You can change this number to test other values
		boolean isPrime = true;
		double sqrt = Math.sqrt(10);
		System.out.println(sqrt);

		if (number <= 1) {
			isPrime = false;
		} else {
			int k;
			
			for (k=2; k <= Math.sqrt(number); k++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

}

