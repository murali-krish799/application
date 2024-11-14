package com.krishsolutions.java.bean;

import java.io.Serializable;

/**
 * @author java bean demonstrate here same as pojo class but it is implements
 *         seriliazable interface
 * 
 *         must be class as public and veriable can provide as private create
 *         setters and getter to variables java bean can use to send normal java
 *         related data to data base or somewhere else it mean it is behave like
 *         seriliaze and return data from databse as deseriliaze
 * 
 *         default constructor must be there
 */
public class JavaBeanDemo implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String age;

	public JavaBeanDemo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
