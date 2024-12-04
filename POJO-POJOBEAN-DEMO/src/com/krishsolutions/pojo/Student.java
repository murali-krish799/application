package com.krishsolutions.pojo;

public class Student {
	
	//linga babu
	private String name;
	//23
	private int age;
//	developer
	private String occupation;
	private Student stu;
//	send back to the database mysql and postgres sql ,oracle
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", occupation=" + occupation + ", stu=" + stu + "]";
	}
	public   void saveData(Student stu) {
		
//		this.stu=stu;
		
		System.out.println(stu);
	}
	
		

}
