/**
 * 
 */
package com.virtusa.ManytoOne.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.ManytoOne.entity.Address;
import com.virtusa.ManytoOne.entity.Employee;

/**
 * @author Damodar Reddy2:28:51 PMApr 9, 2020
 * PersonMain.java
 */
public class PersonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1=new Employee();    
		    e1.setName("Ravi Malik");    
		    e1.setEmail("ravi@gmail.com");    
		      
		    Employee e2=new Employee();  
		    e2.setName("Anuj Verma");  
		    e2.setEmail("anuj@gmail.com");  
		        
		    Address address1=new Address();    
		    address1.setAddressLine1("G-13,Sector 3");    
		    address1.setCity("Noida");    
		    address1.setState("UP");    
		    address1.setCountry("India");    
		    address1.setPincode(201301);    
		        
		    e1.setAddress(address1);    
		    e2.setAddress(address1);  
		    Configuration configuration = new Configuration();
			configuration.configure("hibernate3.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.persist(e1);   
			session.persist(e2);
			transaction.commit();    
			session.close();  
		 
	}

}
