package com.krishsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindHighestNumberOfDuplicateElement {
	public static void main(String[] args) {

		
		List<Integer>listOFnumbers= new ArrayList<>(Arrays.asList(1,2,3,8,8,8,8,8,8,9,9,9,7,7));
		List<Integer>findNumber= new ArrayList<>();
		List<Integer>findNumber2= new ArrayList<>();

		
		for(Integer num:listOFnumbers) {//8
			
				if(!findNumber.contains(num)) {
					
					findNumber.add(num);
					
					
				
			}else {
				if(!findNumber2.contains(num)) {
				
				findNumber2.add(num);
				findNumber2.add(num);
				}else {
					findNumber2.add(num);
				}
			}
				
				
		}
		
		int count1=8;
		int countOneDigit=0;
		int count3=9;
		int count4=7;
		int countSecondDigit=0;
		int countThirdDigit=0;
		for(int num:findNumber2) {
			
			
			if(count1==num) {
				
				countOneDigit++;
			}else if(count3==num) {
				countSecondDigit++;
			}if(count4==num) {
				countThirdDigit++;
			}
			
		}
		int highestNumber=0;
		if(countOneDigit>=countSecondDigit&&countOneDigit>=countThirdDigit) {
			highestNumber=count1;
			
		}else if(countSecondDigit>=countOneDigit&&countSecondDigit>=countThirdDigit) {
			highestNumber=count3;
			
		}else {
			
			highestNumber=count4;
		}
	System.out.println(highestNumber);
	}
}
