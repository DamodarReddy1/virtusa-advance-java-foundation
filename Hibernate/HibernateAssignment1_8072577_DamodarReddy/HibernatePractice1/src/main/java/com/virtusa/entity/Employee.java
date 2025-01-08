/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Damodar Reddy4:06:21 PMApr 8, 2020
 * Employee.java
 */
@Entity
@Table(name = "employee101")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Employee {
	
	@Id
	@Column(name="EmployeeId")
	private int employeeId;
	@Column(name="EmployeeName")
	private String employeeName;

	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	

}
