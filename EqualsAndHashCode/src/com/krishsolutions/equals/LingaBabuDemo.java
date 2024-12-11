package com.krishsolutions.equals;

import java.util.Objects;
//parent is object classs
//child is lingababuDemo
public class LingaBabuDemo extends Object{

//	/this means present class object related all variable available here
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LingaBabuDemo other = (LingaBabuDemo) obj;
		return Objects.equals(name, other.name);
	}
	
}
