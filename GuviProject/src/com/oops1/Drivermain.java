package com.oops1;

import java.util.Scanner;

public class Drivermain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//income tax
		System.out.println("Enter the employee ID: ");
		int empid = sc.nextInt();
		System.out.println("Enter the employee name: ");
		String name = sc.nextLine();
		System.out.println("Enter the employee Salary: ");
		double salary = sc.nextDouble();
		Employee emp  = new Employee(empid, name, salary);
		System.out.println("Income Tax : " + emp.calcultetax() );
		
		//sales Tax
		System.out.println("Enter the product ID: ");
		int pid = sc.nextInt();
		System.out.println("Enter the price: ");
		double price = sc.nextDouble();
		System.out.println("Enter the quantity: ");
		int quantity = sc.nextInt();
		
		Product prod   = new Product(pid, price, quantity);
		System.out.println("Sales Tax : " + prod.calcultetax() );
		sc.close();
}
}
