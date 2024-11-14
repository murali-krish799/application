package com.krishsolutions.writeFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriterDemo.createBufferedWriterDemo();
	}

	public static void createBufferedWriterDemo() throws IOException {
		// relative path
		File file = new File("./BufferedWriterDemo.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String data;
		String totalData = "";
		while ((data = br.readLine()) != null) {
			totalData += data + "\n";
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
		
		
		//demonstrate of bufferedwriter 
		
		BufferedWriter bw= new BufferedWriter(new FileWriter(file));
	
		bw.write(totalData+"\n fiveth  line to write from here");
		
		System.out.println("your data has been wrote there of :"+file.getName());
		
		bw.close();
	}
}