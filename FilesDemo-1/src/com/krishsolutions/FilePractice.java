package com.krishsolutions;

import java.io.File;
import java.io.IOException;

/**
 * @author file demonstrate here
 * file can create through java predefine classes
 * 
 */
public class FilePractice {
	
	
	public static void createfile() throws IOException {
		
		File file= new File("./resource/resume.txt");
		if(file.exists()) {
			file.setWritable(true);
			boolean canWrite = file.canWrite();
			System.out.println("can write  :"+canWrite);
			
			boolean canRead = file.canRead();
			System.out.println("canRead :"+canRead);
			
			long lastModified = file.lastModified();
			System.out.println("lastModifie :"+lastModified);
			File absoluteFile = file.getAbsoluteFile();
			System.out.println("absoluteFile :"+absoluteFile);
			String name = file.getName();
			System.out.println("name :"+name);
			
			boolean delete = file.delete();
			System.out.println("file was delete or not :"+delete);
		}
		else {
//			boolean newFile = file.createNewFile();
//			System.out.println("create new file :"+newFile);
			boolean mkdirs = file.mkdirs();
			
			System.out.println("absolute path has been created "+mkdirs);
		
		String parent = file.getParent();
		File file2= new File(parent+"/demo.txt");
		boolean newFile = file2.createNewFile();
		System.out.println("new file :"+newFile);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {

		FilePractice.createfile();
	}

}
