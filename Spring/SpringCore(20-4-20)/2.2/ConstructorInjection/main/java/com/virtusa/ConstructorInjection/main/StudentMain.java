/**
 * 
 */
package com.virtusa.ConstructorInjection.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.virtusa.ConstructorInjection.bean.Student;

/**
 * @author Damodar Reddy8:59:40 PMApr 22, 2020
 * StudentMain.java
 */
public class StudentMain {
	public static void main(String[] args) {
		
	
	 Resource r=new ClassPathResource("springuser.xml");  
     @SuppressWarnings("deprecation")
	BeanFactory factory=new XmlBeanFactory(r);  
       
     Student bean = (Student)factory.getBean("student");
     System.out.println(bean);
	}

}
