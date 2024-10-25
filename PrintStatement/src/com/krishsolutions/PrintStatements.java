package com.krishsolutions;

import java.util.Date;

//we are here demonstrate print statement

public class PrintStatements {

	public static void main(String[] args) {
		//class all static
		
        System.out.print(" 1.this is print method --");
        System.out.print("2.this is another print method..");

        System.out.println("********");
        System.out.println(" 1.this is print method --");
        System.out.println("2.this is another print method..");
        
        System.err.println("this is not eligible for your's");
        
        String name="linga babu";
        System.out.printf("hi what is your name,my name is %s","murali\n");
        System.out.printf("what is your age %d \n",12);//digits
        System.out.printf("what is your name of first latter %c\n",'L');//character
        System.out.printf("what was the date and time that you got job ..? this is time and date of getting job  %tc\n",new Date());
        System.out.printf("this is first line %n this is second line %n this is third line");

	}

	public static String testPrintStatement() {
		return "linga babu doing credit card business logic";

	}

//		/*
//		 * System.out.println("this is println statement");
//		 * System.out.print("this is print statement"); System.err.
//		 * println("this is error statement it will print red color statement");
//		 * 
//		 * System.out.println("this is println statement"); System.err.
//		 * println("this is error statement it will print red color statement");
//		 * System.out.printf("this is %d",4343); System.out.println();
//		 * System.out.printf("this is %b",true); System.out.println();
//		 * System.out.printf(" this is %s","krishsolutions"); System.out.println();
//		 * System.out.printf("this is percentail %%"); System.out.println();
//		 * System.out.printf(" this is %c",'P'); System.out.println();
//		 * System.out.printf("this is %tc",new Date()); System.out.println();
//		 * System.out.printf("this is %f",55.55f); System.out.
//		 * printf("this is %n it will print next line and %n next line print another next line"
//		 * ); System.out.printf("this is ");
//		 * 
//		 */

}
