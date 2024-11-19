package com.krishsolutions.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSalaryOFEmployee {

	public static void main(String[] args) throws Exception {

		String salaryOfEmployee = findSalaryOfEmployee("krish");
	
		System.out.println(salaryOfEmployee);
	
	}

	public static String findSalaryOfEmployee(String employeeName) throws Exception {
		List<Employee> listOfEmp = new ArrayList<>(
				Arrays.asList(new Employee(1, "krish", "20", 001,"2000"),
						new Employee(2, "prasad", "19", 002,"3000"),
						new Employee(3, "dinesh", "17", 003,"4000"),
						new Employee(4, "ruhii", "19", 004,"5000")));
	
	
		for(Employee emp:listOfEmp) {
			
			if(emp.getName().equals(employeeName)) {
				
				return emp.getSalary();			}
		}
		
		throw new Exception("given name doesn't match here");
	}

}
