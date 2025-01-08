/**
 * 
 */
package com.virtusa.main;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;

import com.virtusa.entity.Employeee;



public class Test1 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernatecfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		SQLQuery query = session.createSQLQuery("select name ,salary from Emp");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Object> Employees = query.list();
		System.out.println(Employees);
		for(Object o : Employees)
		{
			Map m=(Map)o;
			System.out.println(m.get("name")+" "+m.get("salary"));
		}
		
//		Employeee e = new Employeee();
//		List<Employeee> list = query.list();
//
//   for(Employeee employee:list)
//   {
//  System.out.println(employee.getEmpid()+employee.getName()+employee.getSalary()+" "+employee.getDept());
//}
//		Query query = session.createQuery("select new Employeee(name,empid) from Employeee as e order by e.empid");
//		Employeee e = new Employeee();  
//		List<Employeee> list = query.list();
//
//   for(Employeee employee:list)
//   {
//  System.out.println(employee.getEmpid()+employee.getName()+employee.getSalary()+" "+employee.getDept());
//	}
  session.close();


	}
}

