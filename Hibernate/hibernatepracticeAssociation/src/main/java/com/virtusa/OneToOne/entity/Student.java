/**
 * 
 */
package com.virtusa.OneToOne.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Temporal(TemporalType.DATE)
    @Column(name="joiningdate")
    private Date joiningdate;
    
    @OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
    private Address address;
    public Student() {
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the joiningdate
	 */
	public Date getJoiningdate() {
		return joiningdate;
	}
	/**
	 * @param joiningdate the joiningdate to set
	 */
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param joiningdate
	 * @param address
	 */
	public Student( String firstName, String lastName, String email, Date joiningdate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.joiningdate = joiningdate;
	}
 
   
    
	
   
}
