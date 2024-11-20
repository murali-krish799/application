package com.krishsolutions.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**here demonstrate of iterate interface
 * it is applicable for collection interface implements classes only
 * like set and list queue implementation classes only
 * it is read and remove data from loop
 */
public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String>list= new ArrayList<>(Arrays.asList("a","b","c","d","this is final"));

		
		Iterator<String> iterator = list.iterator();
	
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println("i think is it empty ..?"+list);
	Map<String,Integer>map= new Hashtable<>();
	map.put("a", 12);
	map.put("b", 23);
	map.put("c", 34);
	map.put("d", 44);
	//demonstrate of create entryset and convert into iterate
	Set<Entry<String,Integer>> entrySet = map.entrySet();
	Iterator<Entry<String, Integer>> iterator3 = entrySet.iterator();
	Iterator<Entry<String, Integer>> iterator2 = map.entrySet().iterator();
	
	
	while(iterator2.hasNext()) {
		
		System.out.println(iterator2.next());
	}
	}

}
