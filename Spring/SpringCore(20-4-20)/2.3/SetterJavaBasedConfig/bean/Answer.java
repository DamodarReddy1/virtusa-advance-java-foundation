/**
 * 
 */
package com.virtusa.SetterJavaBasedConfig.bean;

/**
 * @author Damodar Reddy9:58:51 PMApr 22, 2020
 * Answer.java
 */
public class Answer {
	private int id;  
	private String name;  
	private String by;  
	  
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

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public Answer() {}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", by=" + by + "]";
	}  
}
