/**
 * 
 */
package com.virtusa.ConstructorJavaBasedConfig.bean;

/**
 * @author Damodar Reddy9:58:51 PMApr 22, 2020
 * Answer.java
 */
public class Answer {
	private int id;  
	private String name;  
	private String by;  
	  
	

	
	public Answer(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}

	public Answer() {}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", by=" + by + "]";
	}  
}
