/**
 * 
 */
package com.virtusa.ManyToMany.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.ManyToMany.entity.Employee;
import com.virtusa.ManyToMany.entity.Project;

/**
 * @author Damodar Reddy1:19:40 PMApr 9, 2020
 * EmployeeProjectMain.java
 */
public class EmployeeProjectMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Damodar");
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Nagaraj");
		Project proj= new Project();
		proj.setProjectName("HdfcProject");
		proj.setProjectId(102);
		Project proj1= new Project();
		proj1.setProjectName("CitiBank");
		proj1.setProjectId(101);
		ArrayList<Project> al = new ArrayList<Project>();
		al.add(proj);
		al.add(proj1);
		employee1.setProjects(al);
		employee2.setProjects(al);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate2.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(employee1);   
		session.persist(employee2);
		transaction.commit();    
		session.close();    		



	}

}
