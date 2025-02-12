package com.practices;

public class Skip {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
		if (i == 5) {
		i++; 
		// Ensure the loop progresses
		continue; // Skip printing when i is 5
		}
		System.out.println(i);
		i++;
		}
}
}

