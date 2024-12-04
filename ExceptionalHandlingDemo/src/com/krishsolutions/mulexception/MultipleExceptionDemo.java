package com.krishsolutions.mulexception;

public class MultipleExceptionDemo {

	public static void main(String[] args) throws Exception {
		Employee emp = new Employee();

		emp.setName("linga babu");
		emp.setAge(22);
		emp.setDesignation("java dev");

//		MultipleExceptionDemo.findNoOfExceptions(emp);
		MultipleExceptionDemo.findDefaultException(1, 5);

	}

	public static void findNoOfExceptions(Employee emp) throws Exception {

		if (emp.getName() == "linga babu") {

			System.out.println("name is correct");
		} else {

			throw new Exception("name is not matched ");

		}
		if (emp.getAge() == 20) {

			System.out.println("age is correct");
		} else {

			throw new Exception("age is not matched ");

		}
		if (emp.getDesignation() == "java dev") {

			System.out.println("designation is correct..");
		} else {

			throw new Exception("designation is not matched ");

		}

	}

	public static void findDefaultException(int stringIndex, int size) throws CustomException {
		
		try{String name = "linga babu";
		//5 ->0,1,2,3,4,
		int[] array = new int[size];
		array[0] = 12;
		array[1] = 13;
		array[2] = 14;
		array[3]=15;
		System.out.println(name.length());
		System.out.println(name.charAt(stringIndex));

		System.out.println(array.length);
		//5
		System.out.println(array[size-2]);
		}catch(StringIndexOutOfBoundsException ex) {
			
			System.out.println(ex.getMessage()+"this is string related message");
		}catch(ArrayIndexOutOfBoundsException ex) {
			
			System.out.println(ex.getMessage()+"this is array index outof bonds exception");
		}
		//012
		String words="anc";
		try {
		if(!words.contains("z")) {
			throw new CustomException("this is custom excetion ");
			
		}}
		finally {
			
			System.out.println("mandatory execution");
		}
		
		
		
		
	}

}
