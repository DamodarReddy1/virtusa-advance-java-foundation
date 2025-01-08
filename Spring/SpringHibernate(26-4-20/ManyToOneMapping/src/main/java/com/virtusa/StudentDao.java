/**
 * 
 */
package com.virtusa;

	
	import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;

		@Transactional
	public class StudentDao {
		
		HibernateTemplate template;  
		public void setTemplate(HibernateTemplate template) {  
			this.template = template;  
		}  
		//method to save employee
		@Transactional
		public Serializable saveStudent(Student e){  
			Serializable save = template.save(e); 

			return save;
		}  
		@Transactional
		public Serializable saveCollege(College e){  
			Serializable save = template.save(e); 

			return save;
		} 
	}


