package com.krishsolutions.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("./test.txt");
		
		if(file.exists()) {
			file.delete();
			file.createNewFile();
		}
		FileWriter fw= new FileWriter(file);
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("this is new class to output the code to "+file+"of file");
		
		bw.close();
		FileReader fr= new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		String fullData="";
		String data="";
		while((data=br.readLine())!=null) {
			fullData+=data;
			
		}
		
		System.out.println(fullData);
		br.close();
	}

}
