package com.bypro.dealoffer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id

	private Long productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="discription")
	private String description;

}
