/**
 * 
 */
package com.virtusa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.entity.Book;
import com.virtusa.entity.BookInfo;

/**
 * @author Damodar Reddy11:45:39 PMApr 8, 2020
 * BookMain.java
 */
public class BookMain {

	
  
 
    public static void main(String[] args) {
        BookInfo bkInfo = new BookInfo();
        bkInfo.setBookId(1);
        Book book=new Book();
        book.setBk_name("Harry Potter & The Philosopher's Stone");
        book.setAuthor_name("J. K. Rowling");
        bkInfo.setBook(book);
        Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(bkInfo);
		transaction.commit();
		session.close();
    }
}
