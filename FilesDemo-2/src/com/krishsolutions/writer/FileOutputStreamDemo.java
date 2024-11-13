package com.krishsolutions.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("./biodata.txt");
		if (file.exists())
			file.delete();
			file.createNewFile();
		String name = "krishna pennam ";
		String data = "";
		FileReader fileReader = new FileReader(file);
		int i;

		while ((i = fileReader.read()) != -1) {

			data += String.valueOf((char) i);
		}

		FileOutputStream fos = new FileOutputStream(file);
		String totalData = name + "\n" + data;
		for (char n : totalData.toCharArray()) {
			fos.write(n);

		}
		fileReader.close();
		fos.close();

	}

}
