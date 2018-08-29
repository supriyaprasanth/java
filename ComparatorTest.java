package com.inapp.javatraining.test;

import java.util.*;

class Fruits {
	int fruitId;
	String fruitName;

	public Fruits(int fruitId, String fruitName) {
		this.fruitId = fruitId;
		this.fruitName = fruitName;
	}

	public String toString() {
		return this.fruitId + " " + this.fruitName;
	}
}

class SortbyID implements Comparator<Fruits> {

	public int compare(Fruits a, Fruits b) {
		return a.fruitId - b.fruitId;
	}
}

class SortbyName implements Comparator<Fruits> {
	public int compare(Fruits a, Fruits b) {
		return a.fruitName.compareTo(b.fruitName);
	}
}

class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Fruits> ar = new ArrayList<Fruits>();
		ar.add(new Fruits(111, "mango"));
		ar.add(new Fruits(131, "apple"));
		ar.add(new Fruits(121, "banana"));

		System.out.println("original content of array list : ");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar, new SortbyID());

		System.out.println("\nSorted by Fruit ID");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar, new SortbyName());

		System.out.println("\nSorted by Fruit name");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
