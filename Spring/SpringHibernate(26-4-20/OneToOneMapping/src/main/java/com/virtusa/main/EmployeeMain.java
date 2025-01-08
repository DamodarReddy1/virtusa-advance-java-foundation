/**
 * 
 */
package com.virtusa.main;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.Employee;
import com.virtusa.EmployeeDao;

/**
 * @author Damodar Reddy4:02:22 PMApr 23, 2020
 * EmployeeMain.java
 */
public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("empDao");  
		Employee e=(Employee) ctx.getBean("emp");
		Serializable saveEmployee = dao.saveEmployee(e); 
		System.out.println(saveEmployee);
		System.out.println(e);

	}

}
