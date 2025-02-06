package com.oops;

public class Task1 {
	
	static int age  = 18;
	String name;
	
	public Task1(String name, int age1) {
		System.out.println("person name is " + name + " and Age is "+  age);
	}
	
	
public static void main(String[] args) {
	Task1 obj = new Task1("raja", age);	
}
}
