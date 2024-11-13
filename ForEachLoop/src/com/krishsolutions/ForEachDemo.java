package com.krishsolutions;

import java.util.Arrays;

/**
 * @author demonstrate of foreach loop it will work for collections and arrays only
 * one option that is increment
 * 
 */
public class ForEachDemo {
	public static void main(String[] args) {
		forEachDemo();
	
	}

	public static void forEachDemo() {

		int []i= {12,34,56,6,6,6};
		System.out.println(i[0]);
		for (int k:i) {
			
			System.out.println(k);
		}
		
		System.out.println("***************");
		
		int [][]mutliArrays= {{23,43,5,65,65,65,6,65
		},{232,43,43,565,77,75,73}
		};
		System.out.println("lenght of multiArrays :"+mutliArrays.length);
		int sum=0;
		int[] js = mutliArrays[0];
		
		for(int y:js) {
			
			System.out.println("value of each element :" +y);
		}
		Arrays.asList(js).forEach(System.out::println);
		for(int  l=0;l<mutliArrays.length;l++) {
			
			for(int g=l;g<mutliArrays[l].length;g++) {
				
				System.out.print(mutliArrays[l][g]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		for (int []singleArray:mutliArrays) {
//			for(int  m=0;m<singleArray.length;m+=2) {
//								sum+=singleArray[m];

//				System.out.print(singleArray[m]+" ");
//			}
			for(int m:singleArray) {
				System.out.println();
				sum+=m;
			}
			System.out.println();
		}
		System.out.println("sum of multidimension :"+sum);
	}

}
