/**
 * 
 */
package com.virtusa.ConstructorInjection.bean;

/**
 * @author Damodar Reddy8:51:41 PMApr 22, 2020
 * Laptop.java
 */
public class Laptop {
	int laptopId;
	String laptopName;
	String laptopRam;
	
	public Laptop(int laptopId, String laptopName, String laptopRam) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopRam = laptopRam;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopRam=" + laptopRam + "]";
	}

	public Laptop() {
		super();
	}
	
	
}
