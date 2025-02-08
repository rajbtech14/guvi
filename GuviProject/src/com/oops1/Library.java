package com.oops1;

public class Library {
	private Book[] books;
	public int bookcount ;
	
	public Library() {
		this.books = new Book[5];
		this.bookcount = 0;
	}
	
	// Method to add books
	public void addBook (Book book) {
		if (bookcount < books.length) {
			books[bookcount] = book;
			bookcount ++;
			System.out.println("Books added successfully");
		} else {
			System.out.println("Library is not allowed to add the Books");
		}
	}
	//method to remove books
	public void deleteBook (int bookid, String newauthor, String newtitle) {
		for (int i = 0; i < bookcount; i++) {
			if(books[i].getBookid()==bookid) {
				books[i].setTitle(newtitle);
				books[i].setAuthor(newauthor);
				System.out.println("books are updated successfully");
				return;
			}
		}
	}

	// Method to display books
	public void displayBooks() {
	if (bookcount ==0) {
		System.out.println("No Books available");
	} else {
		System.out.println("Books in the library");
		for (int i = 0; i < bookcount; i++) {
			System.out.println("ID : " + books[i].getBookid());
			System.out.println("Title : " + books[i].getTitle());
			System.out.println("Author : "+ books[i].getAuthor());
			
		}
	}
	
	}

}
