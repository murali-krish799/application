package com.krishsolutions.Readfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * demonstrate of buffered reader here
 * 
 */
public class BufferedReaderDemo {
	
	//entrhy point of jvm
	public static void main(String[] args) throws IOException {
		BufferedReaderDemo brd= new BufferedReaderDemo();
		brd.createFileAndReadDataThroughBR();
	}

	public void createFileAndReadDataThroughBR() throws IOException {
//		relative path
		File file = new File("./bufferedReaderFile.txt");

		if (!file.exists()) {

			boolean newFile = file.createNewFile();
			if (newFile) {

				System.out.println("your file has been created .. the file name is :" + file.getName());
			}
		}
		
		//buffered reader
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		String totalData="";
		String singleLine;
//		String line = br.readLine();
//		System.out.println(line);
		//true
		while((singleLine=br.readLine())!=null) {
			
		totalData+=	singleLine+"\n";
		}
		
		System.out.println("this is total data from my file \n:"+totalData);
		
//		data likage avoid here
		br.close();
		
	}

}
