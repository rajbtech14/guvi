package com.practices;

import java.util.Scanner;

public class Oddnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to check odd or even: " );
		double num = sc.nextDouble();
		
		for (int i = 0 ;i < num;i ++) {
			if(i % 2!=0 ) {
				System.out.println ("Odd numbers in this given number: " + i );	
			}
		}
	    }
	}


