package com.bypro.dealoffer.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMPRODUCT")
public class CustomProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_product_generator")
	@SequenceGenerator(name="custom_product_generator", sequenceName = "custom_product_seq")
	private Long id;
	
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="discription")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
