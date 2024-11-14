package com.krishsolutions.Readfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
//	entry to handling exceptio and execute the code
	public static void main(String[] args) throws IOException {
		FileInputStreamDemo.createFileAndReadData();
	}

	public static void createFileAndReadData() throws IOException {
//		absolute path
		File file = new File("D:\\omit_krish-editing\\fileinput.txt");

		if (!file.exists()) {

			boolean newFile = file.createNewFile();
			if (newFile) {
				System.out.println("the file is created: " + file.getName());
			}
			
		}
		FileInputStream fis= new FileInputStream(file);
		

		/*
		 * String name="linga babu"; int i = fis.read();
		 * System.out.println("ascii value "+i); System.out.println((char)i);
		 */
		int i;
		String listOfData="";
		while((i=fis.read())!=-1) {
			System.out.println((char)i);
			listOfData+=String.valueOf((char)i);
		}
		
		System.out.println("entire data here  :"+listOfData);
		fis.close();
		
		
	}

}
