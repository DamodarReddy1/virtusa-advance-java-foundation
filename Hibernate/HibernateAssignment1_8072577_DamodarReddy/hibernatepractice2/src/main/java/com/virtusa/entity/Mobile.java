/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Damodar Reddy9:38:17 PMApr 8, 2020
 * Mobile.java
 */

@Entity
public class Mobile {

	@Id
	@Column(name="IMEI")
	int imeiNumber;

	@Column(name="MobileName")
	String mobileName;

	@Column(name="Ram")
	String ram;
	OperatingSystem operatingSytem;



	public int getImeiNumber() {
		return imeiNumber;
	}




	public String getMobileName() {
		return mobileName;
	}

	public String getRam() {
		return ram;
	}


	@Embedded
	public OperatingSystem getOperatingSytem() {
		return operatingSytem;
	}



	public void setOperatingSytem(OperatingSystem operatingSytem) {
		this.operatingSytem = operatingSytem;
	}



	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setImeiNumber(int imeiNumber) {
		this.imeiNumber = imeiNumber;
	}


	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

}
