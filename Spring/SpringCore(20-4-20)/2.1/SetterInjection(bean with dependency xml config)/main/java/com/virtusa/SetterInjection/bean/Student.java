/**
 * 
 */
package com.virtusa.SetterInjection.bean;

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
	@Override
	public String toString() {
		return "Student [laptop=" + laptop + ", studentRollNo=" + studentRollNo + ", studentName=" + studentName + "]";
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
