package com.acc.lkm.JavaDay1;

public class Book {
	
	public String author_name;
	public int year_of_publication;
	public String book_title;
	
	

	public Book(String author_name, int year_of_publication, String book_title) {
		super();
		this.author_name = author_name;
		this.year_of_publication = year_of_publication;
		this.book_title = book_title;
	}
	
	
	void display() {
		System.out.println(author_name);
		System.out.println(year_of_publication);
		System.out.println(book_title);
	}

	public static void main(String[] args) {
		Book b = new Book("Subhajit", 2019, "How to be a Developer");
		b.display();	
	}

}
