/**
 * 
 */
package com.virtusa.OneToMany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity  
@Table(name="Question") 
public class Question {
	@Id   
	@GeneratedValue(strategy=GenerationType.TABLE)  
	private int id;    
	private String qname;    
	  
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="questionid")  
	@OrderColumn(name="type")
	private List<Answer> answers;

	/**
	 * 
	 */
	public Question() {
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
	 * @return the qname
	 */
	public String getQname() {
		return qname;
	}

	/**
	 * @param qname the qname to set
	 */
	public void setQname(String qname) {
		this.qname = qname;
	}

	/**
	 * @return the answers
	 */
	public List<Answer> getAnswers() {
		return answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
