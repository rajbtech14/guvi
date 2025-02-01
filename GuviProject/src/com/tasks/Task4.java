package com.tasks;

public class Task4 {
	public static void main(String[] args) {
		int arr [] = {87,45,23};
		int min =arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				min = arr[i];
			}	
		}
		System.out.println(min);
		
	}

}