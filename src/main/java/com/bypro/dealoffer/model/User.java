package com.bypro.dealoffer.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERDETAIL")
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_detail_generator")
	@SequenceGenerator(name="user_detail_generator", sequenceName = "user_detail_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phonenumber",unique=true)
	private String phonenumber;
	
	@Column(name="mobileotp")
	private String mobileotp;
	
	@Column(name="location")
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="user")
	private List<CustomProduct> customProductList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getMobileotp() {
		return mobileotp;
	}

	public void setMobileotp(String mobileotp) {
		this.mobileotp = mobileotp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<CustomProduct> getCustomProductList() {
		if(customProductList==null)
		{
			return customProductList=new ArrayList<CustomProduct>();
		}
		return customProductList;
	}

	public void setCustomProductList(List<CustomProduct> customProductList) {
		this.customProductList = customProductList;
	}
}
