package com.exceptionandcollection;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		String weekday [] = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index b/w (0-6):" );
		 int index  = sc.nextInt();
		if(index<0 || index>6) {
			 throw new  ArrayIndexOutOfBoundsException("Not a valid range");
		 }
		System.out.println("day:" + weekday[index]);
	}

}
