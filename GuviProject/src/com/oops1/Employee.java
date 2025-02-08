package com.oops1;
import java.util.Scanner;
class Employee implements Taxable{
private int empid;
private String name;
private double salary;

public Employee(int empid, String name, double salary) {
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	
}
@Override
public double calcultetax() {
	
	return salary*incometax;
}

		
}
