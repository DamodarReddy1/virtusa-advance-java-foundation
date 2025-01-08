/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Damodar Reddy9:38:31 PMApr 8, 2020
 * OperatingSystem.java
 */
@Embeddable
public class OperatingSystem {


	@Column(name="OsName")
	String osName;
	@Column(name="version")
	int version;
	
	public OperatingSystem() {
		
	}
	
	public void setOsName(String osName) {
		this.osName = osName;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
