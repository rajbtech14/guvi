package com.tasks;

import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter the amount: ");
	double purchase = scan.nextInt();
	double discount = 0;
	
	if (purchase <500) {
		System.out.println("No discount is applicable");
	}else if(purchase >=500 && purchase <=1000){
		discount = 10;
	}else if (purchase >=1000) {
		discount = 20;	
	}System.out.println("Final amount is: " + (purchase-(purchase*discount)/100));
}
}
