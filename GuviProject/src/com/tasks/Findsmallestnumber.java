package com.tasks;

public class Findsmallestnumber {
	public static void main(String[] args) {
		int arr [] = {87,45,23};
		int min =arr[0];
		for (int i=0;i<arr.length;i++) {
			System.out.println("for Iteration" +  i);
			if (arr[i]<min) {
				System.out.println("if iteration" + arr[i]);
				min = arr[i];
				System.out.println("Equal to iteration" + min);
			}	
		}
		System.out.println(min);
		
	}

}