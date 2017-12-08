package com.bypro.dealoffer.service;

import java.util.List;

import com.bypro.dealoffer.transferobject.CustomProductTO;

public interface ProductService {
	void save(Object entity);
	public List<CustomProductTO> getCustomProductsByUserId(Long userId);

}
