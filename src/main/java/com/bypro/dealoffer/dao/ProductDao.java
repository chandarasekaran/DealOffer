package com.bypro.dealoffer.dao;

import java.util.List;

import com.bypro.dealoffer.model.CustomProduct;

public interface ProductDao {
	
	 void save(Object entity);
	 public List<CustomProduct> getCustomProductsByUserId(Long userId);

}
