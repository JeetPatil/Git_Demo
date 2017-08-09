package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private int marks;
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]\n";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (this.getRollNo()-(o.getRollNo()));
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student e1 = new Student(2,"Abhi", 81);
		Student e2 = new Student(3,"Abhi", 85);
		Student e3 = new Student(3,"Vaibhav", 80);
		Student e4 = new Student(1,"Sudesh", 81);
		Student e5 = new Student(7,"Alia", 50);
		Student e6 = e1;
		List <Student> l = new ArrayList();
		l.add(e1);
		l.add(e4);
		l.add(e5);
		l.add(e2);
		l.add(e3);
		l.add(e6);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		Set s = new HashSet<>(l);
		System.out.println("\nhh"+s);
		
	}

}
