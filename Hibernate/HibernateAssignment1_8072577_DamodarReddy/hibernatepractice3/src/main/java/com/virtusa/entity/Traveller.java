/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/**
 * @author Damodar Reddy10:44:36 PMApr 8, 2020
 * Traveller.java
 */
@Entity
@Table(name = "TravellerData")
@SecondaryTable(name = "passport_details")
public class Traveller {
	//Column1
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name="FirstName")
	String firstName;
	
	@Column(name="LastName")
	String lastName;
	
	@Column(name="Email")
	String emailId;
	
	//Column2
    @Column(name="PassportNumber",table="passport_details")
	String passportNumber;
    
    @Column(name="Arrival",table="passport_details")
	String arrivalPlace;
    
    @Column(name="Destination",table="passport_details")
	String destintionPlace;
	
	public Traveller() {
		
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param emailId
	 * @param passportNumber
	 * @param arrivalPlace
	 * @param destintionPlace
	 */
	public Traveller(String firstName, String lastName, String emailId, String passportNumber,
			String arrivalPlace, String destintionPlace) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.passportNumber = passportNumber;
		this.arrivalPlace = arrivalPlace;
		this.destintionPlace = destintionPlace;
	}
	


}
