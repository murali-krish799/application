package com.krishsolutions.readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputReader {
	
	public static void main(String[] args) throws IOException {
		File file = new File("./biodata.txt");
		if(!file.exists()) 
		file.createNewFile();
		
		FileInputStream fir= new FileInputStream(file);
		
			
		
		int i;
		String name="";
		while((i=fir.read())!=-1) {
			
			name+=String.valueOf((char)i);
			
		}
		fir.close();
		
		System.out.println(name);
	
	}

}
