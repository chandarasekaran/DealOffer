package com.bypro.dealoffer.transferobject;

import java.io.Serializable;

public class CustomProductTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String productName;
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
