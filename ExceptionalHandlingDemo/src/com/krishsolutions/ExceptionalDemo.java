package com.krishsolutions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionalDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file= new File("d://resume.dec");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileInputStream fis= new FileInputStream(file);
		System.out.println(fis);
		System.out.println("this is file input stream");
	}

	

}
