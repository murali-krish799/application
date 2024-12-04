package com.krishsolution.memory;

public class HeapDemo {
	public static void main(String[] args) {
		int size=10;
//		OutOfMemoryError will get once full heap memory
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			
			int[]m= new int[size]; 
			System.out.println(size);
			size*=2;
		}
		//before increase value=335544320
		//increase heap memory in java
//		-Xmx500m
//		after increase memory  value :1342177280
	}

}
