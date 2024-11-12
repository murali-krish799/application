package com.krishsolutions;
//alt+shift+j then getting documentation comments

/**demonstrate here encapsulation of java
 * describe the ability of an object that hides its data and methods
 * from the rest of world
 * 
 */
public class Client  {

	public static void main(String[] args) {

		Student student= new Student();
		student.setStudentId(1);
		student.setStudentName("krish murali");
		student.setAttendence(false);
		boolean krishAttendence = student.isAttendence();
		System.out.println("student of murali attendence status is :"+krishAttendence);
	}
}