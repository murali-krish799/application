package com.krishsolutions.collection;

public class Employee {

	private int id;
	private String name;
	private String age;
	private int rollNumber;
	private String salary;

	public Employee(int id, String name, String age, int rollNumber) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
	}

	public Employee(int id, String name, String age, int rollNumber, String salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.salary = salary;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Employee() {
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

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + "]";
	}

}
