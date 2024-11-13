package com.krishsolutions;

public class Looping2 {
	public static void main(String[] args) {
		int i;
		for(i=0;;) {
			if(i<=10) {

				System.out.println("this is i value:"+i);
				i++;
			}
			else {
				break;				
			}

		}
	}

}
