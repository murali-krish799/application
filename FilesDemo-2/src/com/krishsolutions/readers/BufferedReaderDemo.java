package com.krishsolutions.readers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("./biodata.txt");
		if (!file.exists())
			file.createNewFile();
		
		BufferedReader br= new BufferedReader(new FileReader(file));
		
		String data;
		String content="";
		while((data=br.readLine())!=null) {
			
			content+=data+"\n";
			
		}
		
		br.close();
		
		System.out.println(content);
		
		
		
	}
}
