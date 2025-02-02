package com.tasks;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value: ");
	int value = sc.nextInt();
	int rev = 0;
	
	for(int rem = 0; value !=0 ; value = value/10) {
		rem = (value %10 );
		rev = rev *10+rem;
		
		
	}System.out.println("Reverse number is : " + rev);
	
}
}
