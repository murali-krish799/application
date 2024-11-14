package com.krishsolutions.writeFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * demonstrate fo fileWriteDemo
 */
public class FileWriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriteDemo.createFileWriteDemo();
	}

	public static void createFileWriteDemo() throws IOException {
		// relative path
		File file = new File("./filewrite.txt");
		
		BufferedReader br= new BufferedReader(new FileReader(file));
		String data;
		String totalData="";
		while((data=br.readLine())!=null) {
			totalData+=data+"\n";
		}
		
		br.close();

		if (file.exists() == false) {

			boolean newFile = file.createNewFile();

			if (newFile) {

				System.out.println("your file got created :" + file.getName());
			}
		} else {

			System.out.println("file is already there that is :" + file.getName());
		}
//filewriter demonstration here
		
		FileWriter fw= new FileWriter(file);
		
		fw.write(totalData+"\n this is new-modified data of java side");
		
		
		fw.close();
		
	}
}
