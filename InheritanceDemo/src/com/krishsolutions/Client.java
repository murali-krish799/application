package com.krishsolutions;

import com.krishsolutions.inheritance1.Guest;

public class Client extends Guest {

	public static void main(String[] args) {
		/*
		 * Guest guest= new Guest(); guest.test(); guest.zTest(); Developer developer=
		 * new Developer(); developer.test();
		 */
		// here demonstrate inheritance concept of extends key

		Client client = new Client();
		client.zTest();
		client.test();
	}

	@Override
	public void test() {
		super.test();//calling here super class of method
		System.out.println("this is test method from client class");
	}

}
