package com.krishsolutions.queue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

import com.krishsolutions.object.Employee;
//@Service
public class Createobject {// =new Createobject()
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, CloneNotSupportedException, IOException {

		// first way to create an object
		System.out.println("****-1");
		Employee e1 = new Employee();// 1010101
		Employee e2 = new Employee();// new container with employee object
		System.out.println(e1.hashCode());
		e1.setPrice(110);
		System.out.println(e1);
		System.out.println("***-2");
		// second way to create new object
		Employee emp = (Employee) Class.forName("com.krishsolutions.object.Employee").newInstance();// remove
		emp.setPrice(200);
		System.out.println(emp);
		Employee emp2 = (Employee) Class.forName("com.krishsolutions.object.Employee").getDeclaredConstructor()
				.newInstance();
		emp2.setPrice(300);
		System.out.println("second object created way " + emp2);

		// third way to create an object

		System.out.println("******-3");
		Employee thirdObj = (Employee) Class.forName("com.krishsolutions.object.Employee").getConstructor()
				.newInstance();
		thirdObj.setPrice(190);
		System.out.println(thirdObj);

		System.out.println("*****-4");

//clone the object _>means actual object copy and send back to as a new object but data as same
		Employee emp4 = (Employee) e1.clone();
		System.out.println(emp4.hashCode());
		System.out.println(emp4);

		System.out.println("*****-5");
		// serialization concept here applicable
		FileOutputStream fos = new FileOutputStream("text.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		Employee e5 = new Employee();
		os.writeObject(e5);// [object inserted into one file-serialization]

		// deserialization
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		e.setPrice(340);// 1220011
		System.out.println(e);

	}

}
