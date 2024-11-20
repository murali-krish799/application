package com.krishsolutions.set;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**collection extends set interface
 * and set has implements three classes those are
 * hashSet
 * linkedHashSet
 * treeser implements nevigableSet,sortedset interface also
 * TreeSet
 * 
 * 
 */
public class SetDemo {
	public static void main(String[] args) {
//does not allowed duplicate values
//		follow sorting order
	Set<Integer>hashSet= new TreeSet<>(Comparator.reverseOrder());
	hashSet.add(1);
	hashSet.add(3);
	hashSet.add(5);
	hashSet.add(2);
	hashSet.add(1);
	
	
	System.out.println(hashSet.add(1));
	System.out.println(hashSet);
	
	
	
	}
}
