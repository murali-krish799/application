package com.krishsolutions.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		// absolute path-> this is full path
//		relative path ->current directory
//		c:/lingabau/filefolder/resume.txt

		File file = new File("./resume.txt");

		System.out.println("my file is there in current directory :?" + file.exists());
		// true
		boolean newFile = file.createNewFile(); //
		System.out.println("created file :" + newFile);// false

		if (!file.exists()) {

			System.out.println("my file is going to delete :" + file.delete());
		}

		file.createNewFile();
		System.out.println(file.canRead());
		System.out.println(file.canWrite());

		System.out.println("going to unwrite");

		file.setWritable(true);
		System.out.println("can write ?" + file.canWrite());

		boolean hidden = file.isHidden();
		System.out.println("hidden : " + hidden);

		String absolutePath = file.getAbsolutePath();

		System.out.println("find the absolute path :" + absolutePath);
		// D:\omit_krish-editing\application-master\FilesDemo-1 String parent =
		String parent = file.getParent();
		System.out.println("find the parent path :" + parent);

		File file2 = new File(parent + "/practiceFile.doc");

		if (!file2.exists()) {

			file2.createNewFile();
			System.out.println("my file name is " + file2.getName());
		}
		String path = file.getPath();
		String path2 = file2.getPath();

		System.out.println("getting path here :" + path + "\n" + path2);

		System.out.println("***********");
//	 we are going to demonstrate of relative path creation here below
		File absoluteFile = new File("D:\\omit_krish-editing\\filedemo.txt");

		if (!absoluteFile.exists()) {

			boolean newFile2 = absoluteFile.createNewFile();

			if (newFile2) {
				System.out.println(
						"your file has been create that you provide absolute path .. do check for confirmation");

			} else {
				System.out.println("some interruption has occured..");
			}

		} else {

			System.out.println("my dear customer your file already created");

			System.out.println("ok fine right now i want to delete my current file");

			boolean delete = absoluteFile.delete();

			if (delete) {

				System.out.println("good news your file got deleted");
			}
		}

		/*Employee emp1= new Employee();
		Employee emp2= new Employee();
		Employee emp3= new Employee();
		Employee emp4= new Employee();
		
		Employee[] empList= {emp1,emp2,emp3,emp4};
		
		for(Employee emp:empList) {
			
			System.out.println(emp.hashCode());
		}
	*/
		
	}
	

}
/*
 * class Employee{
 * 
 * 
 * }
 */