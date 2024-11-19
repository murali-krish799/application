package com.krishsolutions.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriintlistOfEmployees {

	public static void main(String[] args) {

		List<Employee> listOfEmp = new ArrayList<>(
				Arrays.asList(new Employee(1, "krish", "20", 001),
						new Employee(2, "prasad", "19", 002),
						new Employee(3, "dinesh", "17", 003),
						new Employee(4, "ruhii", "19", 004)));
	
		System.out.println(listOfEmp);
		Employee employee = listOfEmp.get(0);
		String age = employee.getAge();
		System.out.println(age);
		
listOfEmp.forEach(System.out::println);	
	}

}
