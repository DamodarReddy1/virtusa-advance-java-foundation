/**
 * 
 */
package com.virtusa.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.entity.Contract_Employee;
import com.virtusa.entity.Employee;
import com.virtusa.entity.Regular_Employee;

/**
 * @author Damodar Reddy4:23:10 PMApr 8, 2020
 * EmployeeMain.java
 */
public class EmployeeMain {

	public static void main(String[] args) {
		
			Regular_Employee regular_Employee =  new Regular_Employee();
			regular_Employee.setEmployeeId(1);
			regular_Employee.setEmployeeName("damodar");
			regular_Employee.setBonus(30000);
			regular_Employee.setSalary(30000.0f);
			
			Contract_Employee contract_Employee = new Contract_Employee();
			contract_Employee.setEmployeeId(2);
			contract_Employee.setEmployeeName("nagaraju");
			contract_Employee.setContract_duration("50 hrs");
			contract_Employee.setPay_per_hour(1000);
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernatecfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction t=session.beginTransaction();
			session.save(regular_Employee);
			session.save(contract_Employee);
			t.commit();
			session.close();
	}

}
