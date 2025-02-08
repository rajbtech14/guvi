package com.oops1;

public class Bookmanagement {
	public static void main(String[] args) {
		Library lb = new Library();
		lb.addBook(new Book(1,"java","james gosling"));
		lb.addBook(new Book(1,"effective java","joshua"));
		lb.addBook(new Book(1,"coding effective","Robert"));
		
		lb.displayBooks();
		lb.deleteBook(1, "effective coding", "joshua block");
		lb.displayBooks();
	}

}
