package com.krishsolutions.pojo;

public class Client {
	public static void main(String[] args) {
		Student stu= new Student();
		stu.setName("murali");
		stu.setAge(23);
		stu.setOccupation("learning java");
			
		stu.saveData(stu);
		//client UI POJO     MySql take from pojo and save data
//		---------> --------> -------->
//		<---client ui--        <-pojo----    <---mysql
	}
	
	

}
