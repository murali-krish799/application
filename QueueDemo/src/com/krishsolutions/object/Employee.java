package com.krishsolutions.object;

import java.io.Serializable;

//path 00110001erhekjhe[]wknwk
public class Employee implements Cloneable,Serializable{//new employee();
	public Employee() {
		System.out.println("object got created..");
	}
	
	@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Employee [price=" + price + "]";
	}
	
}
