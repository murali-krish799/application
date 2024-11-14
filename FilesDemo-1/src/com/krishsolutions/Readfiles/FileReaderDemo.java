package com.krishsolutions.Readfiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
//entry to jvm
	public static void main(String[] args) throws IOException {

		FileReaderDemo.createFileAndReadFromFileReader();
	}

	public static void createFileAndReadFromFileReader() throws IOException {

//		this is absolute path
		File file =new File("D:\\omit_krish-editing\\fileReader.txt");
	
		if(!file.exists()) {
			
			boolean newFile = file.createNewFile();
			
			if(newFile) {
				System.out.println("file has been created..");
			}
		}else {
			
			System.out.println("my dear customer file already exists.."+file.getName());
		}
		
		//demonstrate here filereader to input data
//		autoclosable interface implementation
//		try with resource
		FileReader fr= new FileReader(file);
	
		int i;
		String totalData="";
		while((i=fr.read())!=-1) {
			           //String convertion char int number     
			totalData+=String.valueOf((char)i);
			
			
		}
		
		System.out.println("my total data is :"+totalData);
		fr.close();
	}
}
