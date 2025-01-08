/**
 * 
 */
package com.virtusa.ManyToMany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Damodar Reddy1:17:58 PMApr 9, 2020
 * Employee.java
 */
@Entity  
@Table(name="EmployeeProj")
public class Employee {

	@Id
	@Column(name="empId")
	private int id;
	
	@Column(name="employeeName")
	private String name;
	
	
	@ManyToMany(targetEntity = Project.class, cascade = { CascadeType.ALL })
	
	private List<Project> projects;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the projects
	 */
	public List<Project> getProjects() {
		return projects;
	}
	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	} 
}
