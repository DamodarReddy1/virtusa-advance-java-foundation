/**
 * 
 */
package com.virtusa.SetterInjection.bean;

/**
 * @author Damodar Reddy8:51:41 PMApr 22, 2020
 * Laptop.java
 */
public class Laptop {
	int laptopId;
	String laptopName;
	String laptopRam;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopRam=" + laptopRam + "]";
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopRam() {
		return laptopRam;
	}
	public void setLaptopRam(String laptopRam) {
		this.laptopRam = laptopRam;
	}
}
