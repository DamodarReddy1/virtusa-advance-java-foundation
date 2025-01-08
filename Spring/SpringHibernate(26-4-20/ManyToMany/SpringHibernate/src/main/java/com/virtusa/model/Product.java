package com.virtusa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "productName")
	private String ProductName;
	
	public Product() {
		super();
	}
	
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		ProductName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + ProductName + "]";
	}


}
