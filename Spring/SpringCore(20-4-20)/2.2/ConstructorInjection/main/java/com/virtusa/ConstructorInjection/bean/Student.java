/**
 * 
 */
package com.virtusa.ConstructorInjection.bean;

/**
 * @author Damodar Reddy8:50:24 PMApr 22, 2020
 * Student.java
 */
public class Student {
	Laptop laptop;
	int studentRollNo;
	String studentName;
	public Laptop getLaptop() {
		return laptop;
	}
	
	
	
	
	public Student() {
		super();
	}



	public Student(Laptop laptop, int studentRollNo, String studentName) {
		super();
		this.laptop = laptop;
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
	}



	@Override
	public String toString() {
		return "Student [laptop=" + laptop + ", studentRollNo=" + studentRollNo + ", studentName=" + studentName + "]";
	}
	
	

}
