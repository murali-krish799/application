package com.krishsolutions;

/**
 * @author omit_krish arrays is a container to store fixed number of objects of
 *         single data type
 * 
 */
public class ArraysDemo1 {
	public static void main(String[] args) {
		
		multiDimensionArray();
//		int[] o;
//		o = new int[] { 29, 39, 45 };
//		System.out.println(o.length);
//		int[] g = { 13, 24, 45, 56, 77 };
//		System.out.println(g.length);
//
//		int[] i = new int[6];
//		i[0] = 12;
//		i[1] = 13;
//		i[2] = 15;
//		i[3] = 15;
//		i[4] = 16;
//		i[5] = 17;
//
//		System.out.println("this is your i number value " + i[2]);
//		int k = 0;
//		do {
//			System.out.println("i value of index  " + k + " :" + i[k]);
//			k++;
//		} while (k < i.length);
//
//	}
	}

	public static void multiDimensionArray() {

		int[][] multiDimension = { { 1, 23, 4, 5, 66

				}, { 23, 45, 66, 2, 3 } };
		System.out.println("start from here..");
		for(int [] listOfArray:multiDimension) {
			
			for(int number:listOfArray) {
				
				System.out.print(number);
			}
			System.out.println();
		}
		System.out.println("this is second execute starting.....");
		for(int i=0;i<multiDimension.length;i++) {
			
			for(int j=0;j<multiDimension[i].length;j++) {
				
				System.out.print(multiDimension[i][j]);
			}
			System.out.println();
		}
		
	}

}
