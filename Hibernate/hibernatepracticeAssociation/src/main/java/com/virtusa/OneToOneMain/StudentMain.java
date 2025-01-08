/**
 * 
 */
package com.virtusa.OneToOneMain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.OneToOne.entity.Address;
import com.virtusa.OneToOne.entity.Student;
public class StudentMain {

public static void main(String[] args) throws ParseException {
	Address address = new Address("8-88/2","SrinivasNagar,Chintal","Hyderabd","Telangana",50054);
	Student s = new Student("Damodar","Reddy","damodhardubba@gmail.com",new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
	address.setStudent(s);
	s.setAddress(address);
	Configuration configuration = new Configuration();
	
	configuration.configure("hibernatecfg.xml");
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.save(s);
	
	Transaction beginTransaction = session.beginTransaction();
	 beginTransaction.commit();
	
	session.close();
}
}
