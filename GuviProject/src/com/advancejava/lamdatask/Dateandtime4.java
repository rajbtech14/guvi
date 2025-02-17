package com.advancejava.lamdatask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Dateandtime4 {

	
	Dateandtime4() {
		System.out.println("Enter your details");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dateandtime4 details = new Dateandtime4();
		System.out.println("Enter your D.O.B: ");
		int dob = sc.next();
		
		
		LocalDate date  = LocalDate.now();
		System.out.println(date);
		
		

	}

}
