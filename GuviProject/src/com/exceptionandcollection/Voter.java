package com.exceptionandcollection;

import java.util.Scanner;

public class Voter {
	private int age ;
	private int voterid;
	
	public Voter(int age, int voterid) throws AgenotwithinRangeException {
		this.age = age;
		this.voterid = voterid;

		try {
			if(age < 18) {
			throw new AgenotwithinRangeException("invalid age for voting in india");
			}
		} catch (AgenotwithinRangeException e) {
			
			e.getMessage();
		}
	}
	public void display() {
		System.out.println("Voterid: " + " "+ voterid + "Age: " + " " + age);
	}
	
	public static void main(String[] args) throws AgenotwithinRangeException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age: ");
	int age = sc.nextInt();
	throw new AgenotwithinRangeException("Age is not within range");
	}
}
