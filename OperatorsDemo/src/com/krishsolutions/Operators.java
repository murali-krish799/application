package com.krishsolutions;
/*
 * Operators are mainly classified into 5 ways
 * 
 * Arithmetic operations
 * Unary operators
 * Relational operators
 * Conditional operators
 * Assignment operators
 */

public class Operators {


	//arithmetic operators
	//	static method
	public static void arithmeticOperatorsDemo() {
		//		local variables

		int i=10;
		int k=3;

		System.out.println("addition "+i+k);
		System.out.println("subtraction "+(i-k));
		System.out.println("multiplication "+i*k);
		System.out.println("division "+i/k);//10/2=5
		System.out.println("Modulus "+i%k); //10/3=1



	}
	//	unary operator
	public static void UnaryOperatorDemo() {
		int i=10;
		//increment unary operations
		System.out.println("i variable initial value : "+10);//10
		System.out.println("pre - increment----          :"+(++i));//11
		System.out.println("post increment           :"+(i++));//11
		System.out.println("after post increment     :"+i);//12


		System.out.println("*****");
		
		//	decrement unary operations
		int k=10;
		System.out.println("i variable initial value "+k);//10
		System.out.println("pre- decrement "+(--k));//9
		System.out.println("post -decrement "+(k--));//9
		System.out.println("After post- decrement "+k);//8

		
		
//		Relational operators
		
		int r=10;
		int d=5;
		System.out.println("reltional operators");
		System.out.println(r>d);//true
		System.out.println(r<d);//false
		System.out.println(r>=d);//true
		System.out.println(r<=d);//false
		System.out.println(r==d);//false
		System.out.println(r!=d);//true
		
		
		System.out.println();
		
		System.out.println("conditional operators");
//and && or ||
		
		int a=10;
		int b=20;
		if(a==10||b==15) {//condition false
			
			System.out.println("this is true..?");
		
//			Assignment operators
		
			System.out.println("assignement ");
			int g=10;
		
			System.out.println(g+=10);//20
			
			System.out.println(g-=10);//10
			System.out.println(g*=2);//20
			System.out.println(g/=2);//10
			System.out.println(g%=2);//0
		
		}
	}




	//	main method to execute program
	public static void main(String[] args) {

//			Operators.arithmeticOperatorsDemo();
		Operators.UnaryOperatorDemo();

	}
}
