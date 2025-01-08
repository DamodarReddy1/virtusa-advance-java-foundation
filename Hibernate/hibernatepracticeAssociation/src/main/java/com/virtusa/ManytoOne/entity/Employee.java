/**
 * 
 */
package com.virtusa.ManytoOne.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author Damodar Reddy2:20:08 PMApr 9, 2020
 * Person.java
 */
@Entity  
@Table(name="EmployeeAd")  
public class Employee {    
     @Id  
     @GeneratedValue(strategy=GenerationType.AUTO)    
private int employeeId;    
private String name,email;    
@ManyToOne(cascade=CascadeType.ALL)  
private Address address;  
public int getEmployeeId() {  
    return employeeId;  
}  
public void setEmployeeId(int employeeId) {  
    this.employeeId = employeeId;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public Address getAddress() {  
    return address;  
}  
public void setAddress(Address address) {  
    this.address = address;  
}    
}  
