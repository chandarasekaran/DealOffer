package com.bypro.dealoffer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bypro.dealoffer.dao.ProductDao;
import com.bypro.dealoffer.model.CustomProduct;
import com.bypro.dealoffer.transferobject.CustomProductTO;

@Service("ProductService")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;
	
	public void save(Object entity) {
		dao.save(entity);
	}

	public List<CustomProductTO> getCustomProductsByUserId(Long userId) {
		
		List<CustomProduct> productList=dao.getCustomProductsByUserId(userId);
		List<CustomProductTO> productToList=null;
		if(productList!=null && !productList.isEmpty())
		{
			productToList=new ArrayList<CustomProductTO>();
			CustomProductTO cusTo=null;
			for(CustomProduct product:productList)
			{
				cusTo=new CustomProductTO();
				cusTo.setId(product.getId());
				cusTo.setProductName(product.getProductName());
				cusTo.setDescription(product.getDescription());
				productToList.add(cusTo);
			}
		}
		return productToList;
	}

}
