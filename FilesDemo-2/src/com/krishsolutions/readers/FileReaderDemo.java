package com.krishsolutions.readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("./biodata.txt");
		if (!file.exists())
			file.createNewFile();

		FileReader fileReader= new FileReader(file);
		int i;
		String bio="";
while((i=(char)fileReader.read())!=-1) {
	
	bio+=String.valueOf((char)i);
	
}
		fileReader.close();
		
		System.out.println(bio);
	}

}
