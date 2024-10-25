package com.lingababu.lambdaexpression;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<Integer> bankAmountDebit = new Consumer<Integer>() {

			@Override
			public void accept(Integer amount) {
//do develop an business logic here
				System.out
						.println("this " + amount + " amount to store inside of your bank but won't return any value ");

			}

		};
		
		bankAmountDebit.accept(40000);
		
		System.out.println("do write lambda expression scenario");
		
		Consumer<Integer> bankAmountDebit2 = 

			 amount -> {
//do develop an business logic here
				System.out
						.println("this " + amount + " amount to store inside of your bank but won't return any value ");

			};
			
			bankAmountDebit2.accept(7000);

	}
}
