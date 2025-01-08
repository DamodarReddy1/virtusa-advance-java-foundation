/**
 * 
 */
package com.virtusa.ConstructorJavaBasedConfig.bean;

import java.util.List;

/**
 * @author Damodar Reddy9:57:18 PMApr 22, 2020
 * Question.java
 */
public class Question {
	
	private int id;  
	private String name;  
	private List<Answer> answers;  
	  
	public Question() {}

	

	
	public Question(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}

	 
	
}
