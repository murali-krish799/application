package com.krishsolutions.readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("./biodata.txt");
		if (!file.exists())
			file.createNewFile();

		Scanner scanner = new Scanner(new FileInputStream(file));
		String bio = "";
		while (scanner.hasNextLine()) {

			bio += scanner.nextLine()+"\n";

		}

		scanner.close();
		
		System.out.println("details of bio  :"+bio);
	}

}
