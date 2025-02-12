package com.exceptionandcollection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;


public class Student { 
	private  int rollno;
	private String name;
	private  int age;
	private String course;
	
	public  Student(int rollno, String name, int age, String course) throws AgenotwithinRangeException,NameNotValidException {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
		
			try {
				if (age < 15 || age >21 ) {
					throw new AgenotwithinRangeException("Age must be between 15 and 21");
				
				}
			} catch (AgenotwithinRangeException e) {
				e.getMessage();
				System.out.println(e);
			}
			try {
				if (!name.matches("[a-zA-Z]")) {
					throw new NameNotValidException("Name should not contains special charecter");
						
					}
			} catch (NameNotValidException e) {
				
				e.printStackTrace();
				System.out.println(e);
			}
				
	}
	
	public void display() {
		System.out.println("Roll no: " + " " + rollno + "Name : " + " "+ name + "Age: " + " "+ age + "Course: " + " " + course );
	}
	
	public static void main(String[] args) throws AgenotwithinRangeException, NameNotValidException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollno: ");
		int rollno = sc.nextInt();
		System.out.println("enter the age");
		String age = sc.next();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the course");
		String course = sc.next();
		Student st = new Student(rollno, name, rollno, course);
		st.display();
		System.out.println(st);
		sc.close();
	
	}
}
