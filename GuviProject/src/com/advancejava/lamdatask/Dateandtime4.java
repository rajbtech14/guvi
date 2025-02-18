package com.advancejava.lamdatask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;


public class Dateandtime4 {

	
	Dateandtime4() {
		System.out.println("Enter your D.O.B details");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dateandtime4 details = new Dateandtime4();
		System.out.println("Enter your D.O.B in yyyy-mm-dd : ");
		String dob = sc.nextLine();
		sc.close();
		
		LocalDate birthdate = LocalDate.parse(dob);
		LocalDate currentdate  = LocalDate.now();
		Period age = Period.between(birthdate,currentdate);
		
		System.out.println("Your age : " + age.getYears() + " " + "months : " + age.getMonths()+ " " + " days : " + age.getDays() );
		
		

	}

}
