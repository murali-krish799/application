package com.lingababu;

import com.krishsolutions.SecondJava;

public class Client {
	public static void main(String[] args) {
		
		
		SecondJava secondJava= new SecondJava();
		
		secondJava.welcome();
		
		DemoOFDefault demoOFDefault= new DemoOFDefault();
		
		demoOFDefault.welcome();
		
		demoOFDefault.welcomeToProtected();
	}

}
