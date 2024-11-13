package com.krishsolutions.writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("./demo.txt");

		if (file.exists()) {

			file.delete();
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file);

		fw.write("pennam murali krishna alias omit_krish");
		fw.close();
		FileReader fileReader = new FileReader("./demo.txt");

		int i;
		String data = "";
		while ((i = fileReader.read()) != -1) {

			data += String.valueOf((char) i);
		}
		System.out.println("this is from diodata file data :" + data);
		fileReader.close();
	}
}
