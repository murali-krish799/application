package com.krishsolutions;

public class Student {
	//calendar

	/** alt+shift+s ->get some short cut features
	 * 
	 */
	private int studentId;
	private String studentName;
	private boolean isAttendence;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public boolean isAttendence() {
		return isAttendence;
	}
	public void setAttendence(boolean isAttendence) {


		if(!isAttendence) {


			this.isAttendence = true;
			System.out.println("attendence has been assigned..");
		}else {
			this.isAttendence=isAttendence;
			System.out.println("attendence already done by someone else..");
		}
	}



}
