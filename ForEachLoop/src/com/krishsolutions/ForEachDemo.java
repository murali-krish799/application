package com.krishsolutions;

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
		int sum=0;
		for (int []singleArray:mutliArrays) {
			for(int  m=0;m<singleArray.length;m+=2) {
				
				System.out.print(singleArray[m]+" ");
				sum+=singleArray[m];
			}
			System.out.println();
		}
		System.out.println("sum of multidimension :"+sum);
	}

}
