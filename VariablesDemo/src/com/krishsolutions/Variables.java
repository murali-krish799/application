package com.krishsolutions;

/**variables are four types
instant variable(non- static variable)-->define and initialization
class variable (static variable)      -->define and initialization
parameterized variables               -->define only
local variables                       -->define and initialization

*/


public class Variables {
	//data type //variables //data
	int king =80;
	//instant variable & define
	private int studentId=98;
	
	
	//class variable (static variable)
	private static String name="venu";
	
//	static and non static variable
	public void printStaticVariable() {
		Variables variables = new Variables();
		variables.studentId=12;
		
		System.out.println("*********");
		System.out.println("variables name "+variables.studentId +variables.hashCode());
		Variables variables2 = new Variables();
		System.out.println("variables name "+variables2.studentId +variables2.hashCode());
		variables.studentId=12;
		Variables variables3 = new Variables();
		variables.studentId=12;
		System.out.println("variables name "+variables3.studentId +variables3.hashCode());
		System.out.println("*********");

		
		
		
		
		System.out.println("non static variable");
		System.out.println(variables.studentId);
		System.out.println("static variable");
		Variables.name="omit_krisdnfkdnfkh";
//		000008787-unique
		System.out.println(Variables.name);
	}
//	local variable
	public void printLocalVariable() {
		String name;
		
		System.out.println(name="krishsolutions");
		
		
	}
	
//	parameterized variables
	public String printParameterizedVariable(String name) {
		final int id=1;
		name="omit_krish";
		
		return name+"with id "+id;
		
	}
	public static void main(String[] args) {
//		new Variables().printStaticVariable();
//		new Variables().printLocalVariable();
//		String printParameterizedVariable = new Variables().printParameterizedVariable(null);
//		System.out.println("printParameterizedVariable : "+printParameterizedVariable);
//	
//	Variables variables = new Variables();
//	variables.createAccount("babu");
		
		Variables variables=new Variables();
		variables.localVariablesDemo("babu");
		
	}
	
//	non static
	public void createAccount(String customer) {
		
		customer="venu or babu";
		System.out.println("dear "+customer+" user account has been created");
	}
	
	
	public void localVariablesDemo(String name) {
		  double amount=0.00;//non static
		 
		 int i = InterfaceDemo.i;
		 
		 System.out.println(i);
		
		if(name=="venu") {
			
			amount+=3000.00;//override
			
		}
		
		System.out.println("venu got bonus amount "+amount);
		
	}

}
