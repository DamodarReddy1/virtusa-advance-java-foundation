package com.virtusa.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@Column(name = "customerId")
	private int customerId;
	@Column(name = "customerName")
	private String customerName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_product", joinColumns = { @JoinColumn(name = "customerId") }, inverseJoinColumns = {
			@JoinColumn(name = "produdctId") })
	private Set<Product> productsList;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, Set<Product> productsList) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.productsList = productsList;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(Set<Product> productsList) {
		this.productsList = productsList;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", productsList="
				+ productsList + "]";
	}

}
