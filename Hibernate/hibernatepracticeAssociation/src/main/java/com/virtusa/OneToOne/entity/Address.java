/**
 * 
 */
package com.virtusa.OneToOne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Damodar Reddy11:47:47 AMApr 9, 2020
 * Address.java
 */
@Entity
@Table(name="Address")
public class Address { 

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	@Column(name="HouseNo")
	String houseNo;
	@Column(name="StreetName")
	String streetName;
	@Column(name="CityName")
	String  city;
	@Column(name="State")
	String  State;
	@Column(name="Pin")
	int pinNo;
	
	@OneToOne(targetEntity=Student.class)
	private Student student;

	/**
	 * @param addressId
	 * @param houseNo
	 * @param streetName
	 * @param city
	 * @param state
	 * @param pinNo
	 * @param student
	 */
	public Address(String houseNo, String streetName, String city, String state, int pinNo) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		State = state;
		this.pinNo = pinNo;
	}

	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}

	/**
	 * @return the pinNo
	 */
	public int getPinNo() {
		return pinNo;
	}

	/**
	 * @param pinNo the pinNo to set
	 */
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
