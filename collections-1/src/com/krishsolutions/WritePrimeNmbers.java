package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WritePrimeNmbers {
	public static void main(String[] args) {

		List<Integer> primeNumbers = WritePrimeNmbers.primeNumbers(50);
		
		System.out.println("prime numbers of list :"+primeNumbers);
		
		
	}
	
	public static List<Integer>primeNumbers(int value){
		List<Integer>listOfPrimeNum=new ArrayList<>();
		
		
			
			
		for (int i = 0; i <=value; i++) {
			
			if(isPrime(i)) {
				
				listOfPrimeNum.add(i);
			}
		}
		
		return listOfPrimeNum;
	}
	
	private static boolean isPrime(int number) {
		if (number <= 1) {
		return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
		if (number % i == 0) {
		return false;
		}
		}
		return true;
		}
}
