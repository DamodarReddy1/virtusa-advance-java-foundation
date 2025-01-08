/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Damodar Reddy4:06:52 PMApr 8, 2020
 * Regular_Employee.java
 */
@Entity
public class Regular_Employee extends Employee {

	@Column(name="salary")    
	private float salary;  
	  
	@Column(name="bonus")     
	private int bonus;

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Regular_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}

	/**
	 * 
	 */
	public Regular_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}  
	  
	
}
