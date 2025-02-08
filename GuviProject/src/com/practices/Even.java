package com.practices;

public class Even {

	public static void main(String[] args) {
		
		int num = 10;
		 for (int i=0; i < num; i++) {
			if (i %2 == 0) {
				System.out.println(i);
			}else{
				System.out.println("Odd");
			}
		}

	}

}
