package com.example.assignment.tdd.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Q6_Author {
	public int bookcount(String authorname) {
		Book b = new Book("c language", 200.50, "Educational");
		Book b1 = new Book("c++ language", 201.50, "Educational");
		Book b2 = new Book("java language", 201.50, "Educational");
		Book b3 = new Book("java1 language", 201.50, "Educational");

		Author a1 = new Author(b, "balaguruswamy");
		Author a2 = new Author(b1, "balaguruswamy");
		Author a3 = new Author(b2, "balaguruswamy");
		Author a4 = new Author(b3, "kanetkar");

		List<Author> list = new ArrayList<Author>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);

		// list.stream().collect(grouping(Author::getAuthor_Name).counting());

		int count = 0;

		for (Author at : list) {

			if (authorname.equals(at.getAuthor_Name())) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		Q6_Author t = new Q6_Author();
		int count1 = t.bookcount("balaguruswamy");
		System.out.println(count1);

	}
}

class Author {
	private Book book;
	private String Author_Name;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getAuthor_Name() {
		return Author_Name;
	}

	public void setAuthor_Name(String author_Name) {
		Author_Name = author_Name;
	}

	public Author(Book book, String author_Name) {
		super();
		this.book = book;
		Author_Name = author_Name;
	}

	@Override
	public String toString() {
		return "Author [book=" + book + ", Author_Name=" + Author_Name + "]";
	}

}

class Book {
	private String Book_Name;
	private double Book_Price;
	private String Book_Type;

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public double getBook_Price() {
		return Book_Price;
	}

	public void setBook_Price(double book_Price) {
		Book_Price = book_Price;
	}

	public String getBook_Type() {
		return Book_Type;
	}

	public void setBook_Type(String book_Type) {
		Book_Type = book_Type;
	}

	public Book(String book_Name, double book_Price, String book_Type) {
		super();
		Book_Name = book_Name;
		Book_Price = book_Price;
		Book_Type = book_Type;
	}

	@Override
	public String toString() {
		return "Book [Book_Name=" + Book_Name + ", Book_Price=" + Book_Price + ", Book_Type=" + Book_Type + "]";
	}

}
