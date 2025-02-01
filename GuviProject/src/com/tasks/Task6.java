package com.tasks;

import java.util.Iterator;

public class Task6 {

	public static void main(String[] args) {
		int row = 5;
		
		for (int i = row -1; i >= 0; i--) {
			int column = row;
			for (int j = 0; j < row; j++) {
				System.out.print(column);
				if (j>=i) {
					column--;
				}		
			}
			System.out.println();
		}

	}

}
