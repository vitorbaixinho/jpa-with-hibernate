package com.vbaixinho.springboot.basics.springbootin10steps;

public class Book {
	
	long id;
	String author;
	String title;
	
	public Book(long id, String author, String title) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

}
