
package com.virtusa.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.bean.Employee;
import com.virtusa.bean.EmployeeDao;

/**
 * @author Damodar Reddy11:13:11 AMApr 22, 2020
 * EmployeeMain.java
 */
public class EmployeeMain {

	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springjdbc.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    //dao.save(new Employee(1,"Damodar",5000); 
	   List<Employee> allEmployees = dao.getAllEmployees();
	   for(Employee e :allEmployees)
	   {
		   System.out.println(e);
	   }
	   List<Employee> Employees = dao.getEmployeesRowMapper();
	   for(Employee e :Employees)
	   {
		   System.out.println(e);
	   }
//	  int i = dao.saveByNamedParameter(new Employee(105,"Damoar",50000));
//	  System.out.println(i);
	  List <Employee> al= new ArrayList<Employee>();
	  Employee e1 = new Employee(102,"Chaithanya",25000);
	  Employee e2 = new Employee(1,"Anwar",50000);
	  al.add(e1);
	  al.add(e2);
	  int[] batchUpdate = dao.batchUpdate(al);
	  System.out.println(batchUpdate.toString());
	   
	}

}
