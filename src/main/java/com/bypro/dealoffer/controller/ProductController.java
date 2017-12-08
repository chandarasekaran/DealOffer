package com.bypro.dealoffer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bypro.dealoffer.model.CustomProduct;
import com.bypro.dealoffer.model.User;
import com.bypro.dealoffer.service.ProductService;
import com.bypro.dealoffer.service.UserService;
import com.bypro.dealoffer.transferobject.CustomProductTO;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="savecustomproduct/{userId}",method=RequestMethod.POST)
	public String saveCustomProduct(@RequestBody CustomProduct cusProduct,@PathVariable Long userId)
	{
		User user=userService.findUserById(userId);
		
		if(user!=null)
		{
			List<CustomProduct> li=new ArrayList<CustomProduct>();
			li.add(cusProduct);
			cusProduct.setUser(user);
			productService.save(cusProduct);
		}
		
		return "done";
		
	}
	@RequestMapping(value="getcustomproduct/{userId}")
	public List<CustomProductTO> getCustomProductsByUserId(@PathVariable Long userId)
	{
		 List<CustomProductTO> productList=productService.getCustomProductsByUserId(userId);
		return productList;
		
	}

}
