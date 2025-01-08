package com.virtusa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	
		
		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			
					
			StudentDao dao=(StudentDao)ctx.getBean("stdDao"); 
			College c =(College) ctx.getBean("college");
			System.out.println(dao.saveCollege(c));
			
			Student e=(Student) ctx.getBean("std");
			Serializable saveEmployee = dao.saveStudent(e); 
			Student e1=(Student) ctx.getBean("std1");
		Serializable saveEmployee1 = dao.saveStudent(e1); 
			System.out.println(saveEmployee);
			System.out.println(saveEmployee1);
			System.out.println(e);

		
		
		
				
		
	}
}
