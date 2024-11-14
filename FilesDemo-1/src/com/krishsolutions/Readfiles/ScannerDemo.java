package com.krishsolutions.Readfiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) throws IOException {
	
		ScannerDemo.scannerDataAndReadData();
		
	}
	
	
	public  static void scannerDataAndReadData() throws IOException {
		//relative path
		File file= new File("./scannerDem.txt");
		if(!file.exists()) {
			
			boolean newFile = file.createNewFile();
		
			if(newFile) {
				System.out.println("your file has been created thank you..\n your file name is :"+file.getName());
			}
		}else {
			
			System.out.println("my dear your file is already exists..");
		}
		
		System.out.println("*********");
		Scanner scanner= new Scanner(file);
		/*
		 * String nextLine = scanner.nextLine();
		 * 
		 * System.out.println(nextLine);
		 */
		// hasnextline will predict next is there or nor if yes means return true orelse false
		
		String totalDataFromFile="";
		while(scanner.hasNextLine())//true 
			{
			
			String nextLine = scanner.nextLine();
			totalDataFromFile+=nextLine +"\n";
			
		}
		
		System.out.println("my file data : "+totalDataFromFile);
		scanner.close();
	}

}
