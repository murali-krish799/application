package com.krishsolutions;

public class GargabeCollection {
	public static void main(String[] args) {

		GargabeCollection gargabeCollection = new GargabeCollection();
		GargabeCollection gargabeCollection1 =gargabeCollection;
	}

	public void test() {
		new GargabeCollection();
		 new String();

	}

	public void demo() {
		 new String();

	}
	
	@Override
	protected void finalize() throws Throwable {
	
	System.out.println("finalised method");
	}
}
