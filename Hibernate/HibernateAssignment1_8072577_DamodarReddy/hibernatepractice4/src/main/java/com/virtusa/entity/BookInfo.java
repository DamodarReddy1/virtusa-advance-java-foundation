/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author Damodar Reddy11:42:32 PMApr 8, 2020
 * BookInfo.java
 */
@Entity
public class BookInfo {
 
    
    @Column(name="BookId")
    private int bookId;
    
    Book book;
 
    /**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the book
	 */
	@Id
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	public BookInfo() { }
 
    
   
    
}