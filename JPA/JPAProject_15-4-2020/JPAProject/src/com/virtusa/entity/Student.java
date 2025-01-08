/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Damodar Reddy10:45:35 PMApr 14, 2020
 * Student.java
 */
@Entity
@Table(name="Student1")
public class Student {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Id
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
