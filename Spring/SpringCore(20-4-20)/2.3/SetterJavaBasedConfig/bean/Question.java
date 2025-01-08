/**
 * 
 */
package com.virtusa.SetterJavaBasedConfig.bean;

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

	public List<Answer> getAnswers() {
		return answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}  
	
}
