/**
 * 
 */
package com.virtusa.ManyToMany.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Damodar Reddy1:18:12 PMApr 9, 2020
 * Project.java
 */

@Entity  
@Table(name="ProjectTable")
public class Project {
	@Id  
	private int projectId;
	
	String projectName;

	/**
	 * 
	 */
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
