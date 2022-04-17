package com.springgit.entities;

import java.time.LocalDate;

public class Book {

	int bookId;
	String title;
	String author;
	Category category;
	String description;
	String isbn;
	String price;
	LocalDate publishDate;
	LocalDate lastUpdateOn;
	public Book() {
		super();
	}
	public Book(int bookId, String title, String author, Category category, String description, String isbn,
			String price, LocalDate publishDate, LocalDate lastUpdateOn) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.description = description;
		this.isbn = isbn;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdateOn = lastUpdateOn;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public LocalDate getLastUpdateOn() {
		return lastUpdateOn;
	}
	public void setLastUpdateOn(LocalDate lastUpdateOn) {
		this.lastUpdateOn = lastUpdateOn;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", isbn=" + isbn + ", price=" + price + ", publishDate=" + publishDate + ", lastUpdateOn="
				+ lastUpdateOn + "]";
	}
	
}
