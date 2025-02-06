package com.oops;

import java.util.Scanner;

public class Productmain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product [] products = new Product[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the Product ID :" + (i+1));
			System.out.println("Product ID : " );
			int pid = sc.nextInt();
			System.out.println("Product price : " );
			double price = sc.nextInt();
			System.out.println("Product quantity : " );
			int quantity = sc.nextInt();
			products[i] = new  Product(pid, quantity, price);
		}
			
			//Highest Price
			int maxprice = 0;
			for (int i = 1; i < 5; i++) {
				if (products[i].price >products[maxprice].price) {
					maxprice = i;
					
				}
			}
			System.out.println("Products with highest price: " + products[maxprice].pid);
				//amount spend on all products
				double totalamount= calculatetotalamount(products);
				System.out.println("Total amount spend all products" + totalamount);
				sc.close();
			}
			

	private static double calculatetotalamount(Product[] products) {
		double total = 0;
		for (Product product : products) {
			total +=product.price*product.quantity;
		}
		return total;
	}
			// total amount spend 
	
	}


