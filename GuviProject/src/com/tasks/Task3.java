package com.tasks;

public class Task3 {
public static void main(String[] args) {
	int input = 876;
	int rev = 0;
	
	for(int rem = 0; input !=0 ; input = input/10) {
		rem = input%10;
		rev = rev *10+rem;
		
		
	}System.out.println("Reverse number is : " + rev);
	
}
}
