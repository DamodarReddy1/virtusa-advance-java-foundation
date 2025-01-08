/**
 * 
 */
package com.virtusa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Contract_Employee extends Employee{
	
	@Column(name="pay_per_hour")  
    private float pay_per_hour;  
      
    @Column(name="contract_duration")  
    private String contract_duration;

	
	public float getPay_per_hour() {
		return pay_per_hour;
	}

	
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	/**
	 * @return the contract_duration
	 */
	public String getContract_duration() {
		return contract_duration;
	}

	/**
	 * @param contract_duration the contract_duration to set
	 */
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	
	@Override
	public String toString() {
		return "Contract_Employee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
	}

	
	public Contract_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}  
    
    

}
