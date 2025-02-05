package com.tasks;

public class Findsmallestnumber {
	public static void main(String[] args) {
		int arr [] = {509,45,23,12};
		long min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min  = arr[i];
			}
		}System.out.println("smallest number is : " + min);
		
	} 

}