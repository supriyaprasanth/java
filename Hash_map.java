package com.inapp.javatraining.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

public class Hash_map {

	public static void main(String args[]) {

		HashMap<String, String> hashmap = new HashMap<String, String>();

		hashmap.put("A", "Apple");
		hashmap.put("B", "Banana");
		hashmap.put("C", "Coconut");
		hashmap.put("D", "Durian");
		hashmap.put("E", "EggFruit");
		hashmap.put("F", "Fig");
		hashmap.put("G", "Grape");

		Set<Entry<String, String>> set1 = hashmap.entrySet();
		Iterator<Entry<String, String>> iterator = set1.iterator();
		while (iterator.hasNext()) {
			Map.Entry map_entry = iterator.next();
			System.out.print("\nkey : " + map_entry.getKey() + "  Value : " + map_entry.getValue());
		}
		String key_input="C";
		String var = hashmap.get(key_input);
		System.out.println("\n\nValue at " +key_input + " is : " + var);

		hashmap.remove("C");
		System.out.println("\nKey and Value after removal:");
		Set<Entry<String, String>> set2 = hashmap.entrySet();
		Iterator<Entry<String, String>> iterator1 = set2.iterator();
		while (iterator1.hasNext()) {
			Map.Entry map_entry2 = iterator1.next();
			System.out.print("\nKey : " + map_entry2.getKey() + "  Value : " + map_entry2.getValue());
		}
		System.out.println("\n");
		
		System.out.println("Size of Hash_Map is : "+hashmap.size());
		System.out.println("Value at the given index is : " + hashmap.get("D"));
		System.out.println("True if hashmap contains the key : "+hashmap.containsKey("A"));
		System.out.println("False if hashmap doesnot contains the key : "+hashmap.containsKey("Z"));
		//System.out.println(hashmap.containsValue(iterator1“Apple”));
		System.out.println("True if hashmap is empty : "+hashmap.isEmpty());
		

	}
}
