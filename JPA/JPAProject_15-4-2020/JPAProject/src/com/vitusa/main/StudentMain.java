package com.vitusa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.virtusa.entity.Student;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_Details");  
		EntityManager em=emf.createEntityManager();  

		em.getTransaction().begin(); 
		
		
		/** Deletion **/
		Student s1=em.find(Student.class,103);  
	    em.remove(s1);  
	    em.getTransaction().commit();  	
		
	/** Updation **/	
//		Student s=em.find(Student.class,101);  
//      System.out.println("Before Updation");
//      System.out.println("Student id = "+s.getId()); 
//      System.out.println("Student name = "+s.getName()); 
//      System.out.println("Student age = "+s.getAge());  
//     System.out.println("Student marks = "+s.getMarks());
//    
//     System.out.println("After Updation");
//     
//     
//     s.setAge(23);
//     
//     
//     System.out.println("Student id = "+s.getId()); 
//     System.out.println("Student Name = "+s.getName()); 
//     System.out.println("Student Age = "+s.getAge());  
//    System.out.println("Student Marks= "+s.getMarks());
    
     

		/** 
		 * fetch
//		Student s=em.find(Student.class,101);  
//        
//        System.out.println("Student Name = "+s.getId()); 
//        System.out.println("Student Age = "+s.getName()); 
//
//        System.out.println("Student id = "+s.getAge());  
//        System.out.println("Student id = "+s.getMarks());  
 * 
 */

//Insert 
//		Student student1 = new Student(103,"Chaithanya",90,22);
//		em.persist(student1);       
//
//		em.getTransaction().commit();  

	  
		em.close();  
		emf.close();
	}

}
