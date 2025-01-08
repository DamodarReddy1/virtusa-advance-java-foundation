/**
 * 
 */
package com.virtusa;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;


/**
 * @author Damodar Reddy3:44:18 PMApr 23, 2020
 * EmployeeDao.java
 */
@Transactional
public class EmployeeDao {
	
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
		this.template = template;  
	}  
	//method to save employee
	@Transactional
	public Serializable saveEmployee(Employee e){  
		Serializable save = template.save(e); 

		return save;
	}  
}
