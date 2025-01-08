/**
 * 
 */
package com.virtusa.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.entity.Traveller;



public class TravellerMain {
	public static void main(String[] args) {
		Traveller traveller1 = new Traveller("Damodar","Reddy","damodhardubba@gmail.com","cfx20198072577d","Hyderabad","Chennai");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(traveller1);
		transaction.commit();
		session.close();
	}

}
