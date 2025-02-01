package com.tasks;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value: ");
		int input = sc.nextInt();
		
		if(input >=0) {
			System.out.println("Given number is Positive");		
		}else {
			System.out.println("Given number is Negative");
		}
			
	}

}
