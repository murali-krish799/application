package com.krishsolutions.writeFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * here demonstrate of file out streamDemo
 * 
 */
public class FileOutStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutStreamDemo.writeDataFromFileOutStream();
	}

	public static void writeDataFromFileOutStream() throws IOException {
//		relative path-current application
		File file = new File("./outputDataFile.txt");

		Scanner scanner = new Scanner(file);
		//2 nextline data here
		String dataofScanner = "";
//		String nextLine = scanner.nextLine();//2-1
//		System.out.println("from scanner " + nextLine);
		while (scanner.hasNextLine())//2 
			{
			dataofScanner += scanner.nextLine()+"\n";//2

		}
		scanner.close();
		System.out.println(dataofScanner);
		// false ==false==true
		if (file.exists() == false) {

			boolean newFile = file.createNewFile();

			if (newFile) {

				System.out.println("new file is  :" + file.getName());
			}
		} else {

			System.out.println("my dear your file is already there..");
		}

		// write data through one class that is fileoutstream

		FileOutputStream fos = new FileOutputStream(file);

//	fos.write('w');//auto boxing and auto unboxing

		System.out.println("********");
		String data = dataofScanner+"\n fiveth one created from java side";

		for (char r : data.toCharArray()) {

			fos.write(r);
			System.out.print(r);

		}
		System.out.println();

		System.out.println("data wrote there :)");

		fos.close();

	}

}
