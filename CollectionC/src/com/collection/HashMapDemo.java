package com.collection;

import java.util.Arrays;
import java.util.HashMap;

class Stud{
	int rollNo;
	double marks;
	public Stud(int rollNo, double marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
}

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stud s = new Stud(25,36.5);
		Stud s1 = new Stud(25,36.5);
		Stud s2 = new Stud(25,36.5);
		System.out.println(s2.getClass().getName());
		
		String st = new String("hi");
		String st1 = new String("hi");
		HashMap<Object, Integer> hm = new HashMap<>();
		hm.put("Abhi", 9999);
		hm.put("Indra", 99999);
		hm.put(s, 999);
		hm.put(s1, 99);
		hm.put("Snow", 99);
		hm.put("Targarian", 9);
		
		System.out.println(hm);
		hm.put(null,0);
		System.out.println(hm);
		hm.put("Shivani", 9);
		System.out.println(hm);
	}

}
