package com.pennam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		PropertiesDemo.SendAndRetrivePro();
	}

	public static void SendAndRetrivePro() throws IOException {

		File file = new File("./dbConfig.properties");

		if (!file.exists()) {

			file.createNewFile();
		} else {
			System.out.println("file already created thank you..");
		}

//		FileInputStream fis= new FileInputStream(file);
		try (FileReader fr = new FileReader(file)) {
			Properties pro = new Properties();
			pro.load(fr);
//		pro.setProperty("name", "omit_krish");
//		pro.setProperty("age", "23");
			pro.setProperty("designation", "java developer");
			FileOutputStream fos = new FileOutputStream(file);
			pro.store(fos, "first comment from here");

			pro.load(fr);

			Set<Entry<Object, Object>> entrySet = pro.entrySet();

			for (Entry<Object, Object> entry : entrySet) {

				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}
