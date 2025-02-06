package com.oops;

import java.util.Scanner;

public class Task3 {	
	double Balance = 10000;
	
	// To display the balance
		public Task3(){
			System.out.println("Account Balance: " + Balance);
		}
		
	// To deposit the amt to account
	public Task3(double deposit ){
		if (deposit <=0 ) {
			System.out.println("InValid amount Entered");
		} else {
			Balance  = Balance + deposit;
			System.out.println("Deposited amount: " + deposit);
			System.out.println("Updated Account Balance: " +Balance);
		}
		
	}
	
	//To display the Withdrawl Amt 
	public Task3(int withdrawl) {
		if (withdrawl > Balance) {
			System.out.println("InValid amount Entered");
		} else {
			Balance  = Balance - withdrawl;
			System.out.println("Withdrawl amount: " + withdrawl);
			System.out.println("Updated Account Balance: " +Balance);
		}
		
		
	}
	public static void main(String[] args) {
		//To display the balance
		Task3 obj = new Task3();
		Scanner sc = new Scanner(System.in);		
		
		//To Display the deposit
		System.out.print("Enter the deposit amount: ");
		double depositamount = sc.nextDouble();
		Task3 obj1 = new Task3(depositamount);
		
		//To Display the withdrawl
				System.out.print("Enter the Withdrawl amount: ");
				int withdrawlamount = sc.nextInt();
				Task3 obj2 = new Task3(withdrawlamount);
		
		sc.close();
		
	}

}
