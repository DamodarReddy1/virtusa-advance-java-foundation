/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employeee {
    
	@Id
	@Column(name = "empid")
	private int empid;
	@Column(name = "salary")
	private double salary;
	@Override
	public String toString() {
		return "Employeee [empid=" + empid + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	@Column(name = "name")
	
	private String name;

	
	@Column(name = "dept")
	private byte dept;
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getDept() {
		return dept;
	}

	public void setDept(byte dept) {
		this.dept = dept;
	}

	public Employeee(int empid, double salary, String name, byte dept) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}
	public Employeee( String name,int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	public Employeee() {
		
	}

	
	

	

}
